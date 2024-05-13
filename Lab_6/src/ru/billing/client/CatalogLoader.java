package ru.billing.client;

import ru.billing.exception.CatalogLoadException;
import ru.billing.stocklist.ItemCatalog;

public interface CatalogLoader {
    void load(ItemCatalog cat) throws CatalogLoadException;
}
