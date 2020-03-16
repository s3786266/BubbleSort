public class BubbleSort
{
    void bubbleSort(int elements[])
    {
        int l = elements.length;
        for (int i = 0; i < l-1; i++)
            for (int j = 0; j < l-i-1; j++)
                if (elements[j] > elements[j+1])
                {
                    // swap the elements[j+1] and elements[i]
                    int temp = elements[j];
                    elements[j] = elements[j+1];
                    elements[j+1] = temp;
                }
    }

    /* Method to Print the elements */
    void printElements(int elements[])
    {
        int n = elements.length;
        for (int i=0; i<n; ++i)
            System.out.print(elements[i] + " , ");
        System.out.println();
    }

    // Main method
    public static void main(String args[])
    {
        BubbleSort bs = new BubbleSort();
        int elements[] = {5, 2, 3, 6, 1, 4, 8};
        System.out.println("Actual list of elements");
        bs.printElements(elements);
        bs.bubbleSort(elements);
        System.out.println("Sorted list of elements");
        bs.printElements(elements);
    }
}