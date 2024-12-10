Below is a C++ program implementing the FIFO (First In, First Out) Page Replacement Algorithm, which generates output in a similar tabular format:

#include <iostream>
#include <vector>
#include <iomanip>
using namespace std;

void displayTable(vector<int> incoming, vector<vector<int>> frames, int pageFaults) {
    cout << "Output:\n";
    cout << "Incoming\tFrame 1\tFrame 2\tFrame 3\n";
    for (size_t i = 0; i < incoming.size(); ++i) {
        cout << incoming[i] << "\t\t";
        for (size_t j = 0; j < frames[i].size(); ++j) {
            if (frames[i][j] == -1)
                cout << "-\t";
            else
                cout << frames[i][j] << "\t";
        }
        cout << "\n";
    }
    cout << "Total Page Faults: " << pageFaults << "\n";
}

int main() {
    int n, framesCount;

    cout << "Enter number of pages: ";
    cin >> n;

    vector<int> pages(n);
    cout << "Enter the page reference string:\n";
    for (int i = 0; i < n; ++i) {
        cin >> pages[i];
    }

    cout << "Enter the number of frames: ";
    cin >> framesCount;

    vector<int> frames(framesCount, -1); // Initialize frames with -1
    vector<vector<int>> frameHistory;   // To keep history of frames for display

    int pageFaults = 0, pointer = 0;

    for (int i = 0; i < n; ++i) {
        bool found = false;
        for (int j = 0; j < framesCount; ++j) {
            if (frames[j] == pages[i]) {
                found = true;
                break;
            }
        }

        if (!found) {
            frames[pointer] = pages[i];
            pointer = (pointer + 1) % framesCount;
            ++pageFaults;
        }

        frameHistory.push_back(frames); // Store current state of frames
    }

    displayTable(pages, frameHistory, pageFaults);

    return 0;
}

Explanation:

1. Input:

Number of pages in the reference string.

Page reference string (sequence of incoming pages).

Number of available frames.



2. Output:

Displays each incoming page and the current state of the frames after processing it.

Shows the total number of page faults.




Sample Input:

Enter number of pages: 5
Enter the page reference string:
4 1 2 4 5
Enter the number of frames: 3

Sample Output:

Output:
Incoming	Frame 1	Frame 2	Frame 3
4		4	-	-
1		4	1	-
2		4	1	2
4		4	1	2
5		5	1	2
Total Page Faults: 4

