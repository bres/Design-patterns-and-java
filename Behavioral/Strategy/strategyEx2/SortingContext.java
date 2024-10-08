package designPatterns.Behavioral.Strategy.strategyEx2;

public class SortingContext {

    private SortInterface sorter = null;

    public void sortInt(int[] list) {
                sorter.sort(list);
            }

    public SortInterface getSorter() { 
        return sorter;
    }
    public void setSorter(SortInterface sorter) { 
        this.sorter = sorter;
    }
}