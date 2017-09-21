package com.bwie.text;

import java.util.List;

/**
 * Desc
 * Author 程茁燕
 * Time 2017/9/18.
 */
public class MyBean {

    /**
     * date : 20170918
     * stories : [{"ga_prefix":"091808","id":9617425,"images":["https://pic2.zhimg.com/v2-c685b99f69dc97a1fe160f7c64262e59.jpg"],"title":"为什么天上的星星除了月球外，肉眼看大小都差不多？","type":0},{"ga_prefix":"091807","id":9614949,"images":["https://pic2.zhimg.com/v2-b39a819f760373dae8857e512fcecb25.jpg"],"title":"查套餐，自动接电话，新夜间模式\u2026\u2026即将开放更新的 iOS 11，有史以来最贴心","type":0},{"ga_prefix":"091807","id":9620744,"images":["https://pic2.zhimg.com/v2-6b9ed2a911069afee7e174a693752071.jpg"],"title":"WePhone 创始人被逼自杀后，世纪佳缘们的新危机","type":0},{"ga_prefix":"091807","id":9617927,"images":["https://pic2.zhimg.com/v2-d9f81acc91b7bce6f59a3ea71887a5c5.jpg"],"title":"流传在表情包界的神图「黑人问号」，究竟神在哪？","type":0},{"ga_prefix":"091806","id":9620861,"images":["https://pic1.zhimg.com/v2-7fbd72986cffa1beb0049aa9562cf518.jpg"],"title":"瞎扯 · 如何正确地吐槽","type":0}]
     * top_stories : [{"ga_prefix":"091807","id":9614949,"image":"https://pic4.zhimg.com/v2-18e6ed53a0b19d2a6542aeba497ea927.jpg","title":"查套餐，自动接电话，新夜间模式\u2026\u2026即将开放更新的 iOS 11，有史以来最贴心","type":0},{"ga_prefix":"091807","id":9620744,"image":"https://pic3.zhimg.com/v2-66e62906ce18af9f16306071fceb2036.jpg","title":"WePhone 创始人被逼自杀后，世纪佳缘们的新危机","type":0},{"ga_prefix":"091717","id":9620104,"image":"https://pic2.zhimg.com/v2-6daf5f56f84bdbc027ce27a236b10f89.jpg","title":"如果你在暴雪上班，你的宠物支持部落还是联盟？","type":0},{"ga_prefix":"091707","id":9613249,"image":"https://pic2.zhimg.com/v2-7f41fd9b4ed66395a9e25cf753d076fd.jpg","title":"我是《看不见的客人》的导演，解释下电影里出现的  Bug","type":0},{"ga_prefix":"091714","id":9616475,"image":"https://pic4.zhimg.com/v2-24fe01a8f533947beac032015af25977.jpg","title":"小猫小狗猴子猩猩都有声带，为什么不能教它们说人话？","type":0}]
     */

    private String date;
    private List<StoriesBean> stories;
    private List<TopStoriesBean> top_stories;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<StoriesBean> getStories() {
        return stories;
    }

    public void setStories(List<StoriesBean> stories) {
        this.stories = stories;
    }

    public List<TopStoriesBean> getTop_stories() {
        return top_stories;
    }

    public void setTop_stories(List<TopStoriesBean> top_stories) {
        this.top_stories = top_stories;
    }

    public static class StoriesBean {
        /**
         * ga_prefix : 091808
         * id : 9617425
         * images : ["https://pic2.zhimg.com/v2-c685b99f69dc97a1fe160f7c64262e59.jpg"]
         * title : 为什么天上的星星除了月球外，肉眼看大小都差不多？
         * type : 0
         */

        private String ga_prefix;
        private int id;
        private String title;
        private int type;
        private List<String> images;

        public String getGa_prefix() {
            return ga_prefix;
        }

        public void setGa_prefix(String ga_prefix) {
            this.ga_prefix = ga_prefix;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public List<String> getImages() {
            return images;
        }

        public void setImages(List<String> images) {
            this.images = images;
        }
    }

    public static class TopStoriesBean {
        /**
         * ga_prefix : 091807
         * id : 9614949
         * image : https://pic4.zhimg.com/v2-18e6ed53a0b19d2a6542aeba497ea927.jpg
         * title : 查套餐，自动接电话，新夜间模式……即将开放更新的 iOS 11，有史以来最贴心
         * type : 0
         */

        private String ga_prefix;
        private int id;
        private String image;
        private String title;
        private int type;

        public String getGa_prefix() {
            return ga_prefix;
        }

        public void setGa_prefix(String ga_prefix) {
            this.ga_prefix = ga_prefix;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }
    }
}
