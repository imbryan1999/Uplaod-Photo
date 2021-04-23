package com.bryan.firebase4;

public class Data {
    private String imageUri, imageName;

    public Data() { }

    public Data(String image, String imgName) {
        if (imgName.trim().equals("")) {
            imgName = "No Name";
        }
        this.imageName = imgName;
        this.imageUri = image;
    }

    public String getImageUri() {
        return imageUri;
    }

    public void setImageUri(String imageUri) {
        this.imageUri = imageUri;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }
}