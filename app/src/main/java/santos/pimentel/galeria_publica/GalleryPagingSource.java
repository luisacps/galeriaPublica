package santos.pimentel.galeria_publica;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class GalleryPagingSource extends ListenableFuturePagingSource <Integer, ImageData> {
    GalleryRepository galleryRepository;
    Integer initialLoadSize = 0;

    public GalleryPagingSource(GalleryRepository galleryRepository) {
        this.galleryRepository = galleryRepository;
    }

    @Nullable
    @Override
    public Integer getRefreshKey(@NonNull PagingState<Integer, ImageData> pagingState) {

    }

}
