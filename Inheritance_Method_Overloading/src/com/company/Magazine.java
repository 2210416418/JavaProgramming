package com.company;

public class Magazine{

    private String magazineTitle;
    private int totalPages;

    public Magazine(String magazineTitle, int totalPages) {
        this.magazineTitle = magazineTitle;
        this.totalPages = totalPages;
    }

    public String getMagazineTitle() {
        return magazineTitle;
    }

    public void setMagazineTitle(String magazineTitle) {
        this.magazineTitle = magazineTitle;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }


}
