
package com.taurus.holidaypiratestest.network.model.articlelist;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.taurus.trivagotest.mostviewedarticles.adapter.MostViewedArticlesUIModel;
import com.taurus.trivagotest.network.model.searcharticle.Doc;
import com.taurus.trivagotest.network.model.searcharticle.Response;
import com.taurus.trivagotest.util.ListConverter;
import java.util.List;

public class ArticleWrapper {

    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("copyright")
    @Expose
    private String copyright;
    @SerializedName("num_results")
    @Expose
    private int numResults;
    @SerializedName("results")
    @Expose
    private List<Result> results = null;

    @SerializedName("response")
    @Expose
    private Response response;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCopyright() {
        return copyright;
    }

    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

    public int getNumResults() {
        return numResults;
    }

    public void setNumResults(int numResults) {
        this.numResults = numResults;
    }

    public List<Result> getResults() {
        return results;
    }

    public void setResults(List<Result> results) {
        this.results = results;
    }

    public Response getResponse() {
        return response;
    }

    public void setResponse(Response response) {
        this.response = response;
    }

    public static List<MostViewedArticlesUIModel> createUIList(ArticleWrapper articleWrapper) {
        return ListConverter.convert(articleWrapper.getResults(), item -> createUIFeeds(item));
    }

    private static MostViewedArticlesUIModel createUIFeeds(Result item) {

        final MostViewedArticlesUIModel model = new MostViewedArticlesUIModel();

        model.setStoryTitle(item.getTitle());
        model.setPublishDate(item.getPublishedDate());
        model.setArticleAbstract(item.getAbstract());

        return model;
    }

    public static List<MostViewedArticlesUIModel> createList(ArticleWrapper articleWrapper) {
        return ListConverter.convert(articleWrapper.getResponse().getDocs(), item -> create(item));
    }

    private static MostViewedArticlesUIModel create(Doc item) {

        final MostViewedArticlesUIModel model = new MostViewedArticlesUIModel();

        model.setArticleAbstract(item.getArticleAbstract());
        model.setStoryTitle(item.getHeadline().getMain());
        model.setPublishDate(item.getPubDate());

        return model;
    }

}
