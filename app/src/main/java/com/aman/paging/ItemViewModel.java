package com.aman.paging;


import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;
import androidx.paging.LivePagedListBuilder;
import androidx.paging.PageKeyedDataSource;
import androidx.paging.PagedList;


/**
 * The type Item view model.
 */
public class ItemViewModel extends ViewModel {

    /**
     * The Item paged list.
     */
    LiveData<PagedList<Item>> itemPagedList;
    /**
     * The Live data source.
     */
    LiveData<PageKeyedDataSource<Integer, Item>> liveDataSource;

    /**
     * Instantiates a new Item view model.
     */
    public ItemViewModel() {

        ItemDataSourceFactory itemDataSourceFactory = new ItemDataSourceFactory();
        liveDataSource = itemDataSourceFactory.getItemLiveDataSource();

        PagedList.Config config =
                (new PagedList.Config.Builder())
                        .setEnablePlaceholders(false)
                        .setPageSize(ItemDataSource.PAGE_SIZE)
                        .build();

        itemPagedList = (new LivePagedListBuilder(itemDataSourceFactory, config)).build();

    }
}
