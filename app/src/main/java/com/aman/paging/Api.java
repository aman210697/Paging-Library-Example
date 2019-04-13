package com.aman.paging;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * The interface Api.
 */
public interface Api {

    /**
     * Gets answers.
     *
     * @param page the page
     * @param size the size
     * @param site the site
     * @return the answers
     */
    @GET("answers")
    Call<StackApiResponse> getAnswers(
            @Query("page") int page,
            @Query("pagesize") int size,
            @Query("site") String site
    );
}
