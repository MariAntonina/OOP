package Sorter;

/**
 * Created by admin on 28.08.2017.
 */
public final class Sorterr {

    protected ISortowanie _sortowanie;

    public Sorterr(ISortowanie sortowanie){
        setSortowanie(sortowanie);
    }
    public void setSortowanie(ISortowanie sortowanie){
        _sortowanie = sortowanie;
    }
    public int[] doSorting(int[] toSort){
        return  _sortowanie.sort(toSort);
    }

}

