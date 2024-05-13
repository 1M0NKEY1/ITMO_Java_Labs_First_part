package ru.billing.stocklist;

import ru.billing.stocklist.GenericItem;

public class TechnicalItem extends GenericItem {
    short warrantlyTime;

    @Override
    public void PrintAll() {
        super.PrintAll();
        System.out.println(warrantlyTime);
    }
}
