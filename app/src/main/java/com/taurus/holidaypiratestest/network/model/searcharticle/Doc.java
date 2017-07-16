
package com.taurus.holidaypiratestest.network.model.searcharticle;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Doc {

    @SerializedName("web_url")
    @Expose
    private String webUrl;

    @SerializedName("snippet")
    @Expose
    private String snippet;

    @SerializedName("lead_paragraph")
    @Expose
    private String leadParagraph;

    @SerializedName("source")
    @Expose
    private String source;

    @SerializedName("pub_date")
    @Expose
    private String pubDate;

    @SerializedName("document_type")
    @Expose
    private String documentType;

    @SerializedName("news_desk")
    @Expose
    private String newsDesk;

    @SerializedName("section_name")
    @Expose
    private String sectionName;

    @SerializedName("subsection_name")
    @Expose
    private String subsectionName;

    @SerializedName("type_of_material")
    @Expose
    private String typeOfMaterial;

    @SerializedName("_id")
    @Expose
    private String id;

    @SerializedName("word_count")
    @Expose
    private int wordCount;

    @SerializedName("headline")
    @Expose
    private Headline headline;

    @SerializedName("abstract")
    @Expose
    private String articleAbstract;

    public String getWebUrl() {
        return webUrl;
    }

    public void setWebUrl(String webUrl) {
        this.webUrl = webUrl;
    }

    public String getSnippet() {
        return snippet;
    }

    public void setSnippet(String snippet) {
        this.snippet = snippet;
    }

    public String getLeadParagraph() {
        return leadParagraph;
    }

    public void setLeadParagraph(String leadParagraph) {
        this.leadParagraph = leadParagraph;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getPubDate() {
        return pubDate;
    }

    public void setPubDate(String pubDate) {
        this.pubDate = pubDate;
    }

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    public String getNewsDesk() {
        return newsDesk;
    }

    public void setNewsDesk(String newsDesk) {
        this.newsDesk = newsDesk;
    }

    public String getSectionName() {
        return sectionName;
    }

    public void setSectionName(String sectionName) {
        this.sectionName = sectionName;
    }

    public String getSubsectionName() {
        return subsectionName;
    }

    public void setSubsectionName(String subsectionName) {
        this.subsectionName = subsectionName;
    }

    public String getTypeOfMaterial() {
        return typeOfMaterial;
    }

    public void setTypeOfMaterial(String typeOfMaterial) {
        this.typeOfMaterial = typeOfMaterial;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getWordCount() {
        return wordCount;
    }

    public void setWordCount(int wordCount) {
        this.wordCount = wordCount;
    }

    public Headline getHeadline() {
        return headline;
    }

    public void setHeadline(Headline headline) {
        this.headline = headline;
    }

    public String getArticleAbstract() {
        return articleAbstract;
    }

    public void setArticleAbstract(String articleAbstract) {
        this.articleAbstract = articleAbstract;
    }
}
