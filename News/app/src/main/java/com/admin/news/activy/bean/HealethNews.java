package com.admin.news.activy.bean;

import java.util.List;

/**
 * Created by admin on 2017/3/19.
 */

public class HealethNews {
    /**
     * result : {"list":{"tngou":[{"keywords":"社会热点","name":"社会热点","description":"社会热点，健康资讯，综合健康资讯,生活热点新闻,社会热点新闻,社会热点查询,提供最新的健康资讯,社会热点新闻网","id":6,"title":"社会热点","seq":1},{"keywords":"食品新闻","name":"食品新闻","description":"食品新闻,食品新闻,食品安全新闻,食品资讯,食品行业新闻,食品资讯,餐饮资讯,提供专业的食品新闻查询,食品新闻网","id":5,"title":"食品新闻","seq":2},{"keywords":"疾病快讯","name":"疾病快讯","description":"疾病快讯,疾病资讯,疾病新闻,提供专业 最新的疾病信息,疾病信息查询,了解最新的疾病资讯,疾病快讯网","id":7,"title":"疾病快讯","seq":2},{"keywords":"药品新闻","name":"药品新闻","description":"药品新闻 ,是发布中国有关药品,医疗器械,保健药品等专业医药资讯,提供最新的药品新闻资讯,药品新闻网","id":4,"title":"药品新闻","seq":3},{"keywords":"生活贴士","name":"生活贴士","description":"生活贴士,提供专门的健康生活贴士,解决健康生活问题,如何健康生活,健康生活提示,提供最新的健康生活新闻资讯,生活贴士网","id":3,"title":"生活贴士","seq":4},{"keywords":"医疗新闻","name":"医疗新闻","description":"医疗新闻,医院最新资讯,医疗事故,医疗技术,最权威的医院,医疗技术,医疗信息分享平台,提供专业医疗新闻资讯查询,医疗新闻网","id":2,"title":"医疗新闻","seq":5},{"keywords":"企业要闻","name":"企业要闻","description":"企业要闻,医药企业最新动态,最新资讯和新闻,带来最快最全的企业新闻资讯,为人们提供专业的健康,医药公司企业要闻查询,医药企业网","id":1,"title":"企业要闻","seq":6}],"status":true}}
     * reason : 成功的返回
     * error_code : 0
     */
    private ResultEntity result;
    private String reason;
    private int error_code;

    public void setResult(ResultEntity result) {
        this.result = result;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public ResultEntity getResult() {
        return result;
    }

    public String getReason() {
        return reason;
    }

    public int getError_code() {
        return error_code;
    }

    public static class ResultEntity {
        /**
         * list : {"tngou":[{"keywords":"社会热点","name":"社会热点","description":"社会热点，健康资讯，综合健康资讯,生活热点新闻,社会热点新闻,社会热点查询,提供最新的健康资讯,社会热点新闻网","id":6,"title":"社会热点","seq":1},{"keywords":"食品新闻","name":"食品新闻","description":"食品新闻,食品新闻,食品安全新闻,食品资讯,食品行业新闻,食品资讯,餐饮资讯,提供专业的食品新闻查询,食品新闻网","id":5,"title":"食品新闻","seq":2},{"keywords":"疾病快讯","name":"疾病快讯","description":"疾病快讯,疾病资讯,疾病新闻,提供专业 最新的疾病信息,疾病信息查询,了解最新的疾病资讯,疾病快讯网","id":7,"title":"疾病快讯","seq":2},{"keywords":"药品新闻","name":"药品新闻","description":"药品新闻 ,是发布中国有关药品,医疗器械,保健药品等专业医药资讯,提供最新的药品新闻资讯,药品新闻网","id":4,"title":"药品新闻","seq":3},{"keywords":"生活贴士","name":"生活贴士","description":"生活贴士,提供专门的健康生活贴士,解决健康生活问题,如何健康生活,健康生活提示,提供最新的健康生活新闻资讯,生活贴士网","id":3,"title":"生活贴士","seq":4},{"keywords":"医疗新闻","name":"医疗新闻","description":"医疗新闻,医院最新资讯,医疗事故,医疗技术,最权威的医院,医疗技术,医疗信息分享平台,提供专业医疗新闻资讯查询,医疗新闻网","id":2,"title":"医疗新闻","seq":5},{"keywords":"企业要闻","name":"企业要闻","description":"企业要闻,医药企业最新动态,最新资讯和新闻,带来最快最全的企业新闻资讯,为人们提供专业的健康,医药公司企业要闻查询,医药企业网","id":1,"title":"企业要闻","seq":6}],"status":true}
         */
        private ListEntity list;

        public void setList(ListEntity list) {
            this.list = list;
        }

        public ListEntity getList() {
            return list;
        }

        public static class ListEntity {
            /**
             * tngou : [{"keywords":"社会热点","name":"社会热点","description":"社会热点，健康资讯，综合健康资讯,生活热点新闻,社会热点新闻,社会热点查询,提供最新的健康资讯,社会热点新闻网","id":6,"title":"社会热点","seq":1},{"keywords":"食品新闻","name":"食品新闻","description":"食品新闻,食品新闻,食品安全新闻,食品资讯,食品行业新闻,食品资讯,餐饮资讯,提供专业的食品新闻查询,食品新闻网","id":5,"title":"食品新闻","seq":2},{"keywords":"疾病快讯","name":"疾病快讯","description":"疾病快讯,疾病资讯,疾病新闻,提供专业 最新的疾病信息,疾病信息查询,了解最新的疾病资讯,疾病快讯网","id":7,"title":"疾病快讯","seq":2},{"keywords":"药品新闻","name":"药品新闻","description":"药品新闻 ,是发布中国有关药品,医疗器械,保健药品等专业医药资讯,提供最新的药品新闻资讯,药品新闻网","id":4,"title":"药品新闻","seq":3},{"keywords":"生活贴士","name":"生活贴士","description":"生活贴士,提供专门的健康生活贴士,解决健康生活问题,如何健康生活,健康生活提示,提供最新的健康生活新闻资讯,生活贴士网","id":3,"title":"生活贴士","seq":4},{"keywords":"医疗新闻","name":"医疗新闻","description":"医疗新闻,医院最新资讯,医疗事故,医疗技术,最权威的医院,医疗技术,医疗信息分享平台,提供专业医疗新闻资讯查询,医疗新闻网","id":2,"title":"医疗新闻","seq":5},{"keywords":"企业要闻","name":"企业要闻","description":"企业要闻,医药企业最新动态,最新资讯和新闻,带来最快最全的企业新闻资讯,为人们提供专业的健康,医药公司企业要闻查询,医药企业网","id":1,"title":"企业要闻","seq":6}]
             * status : true
             */
            private List<TngouEntity> tngou;
            private boolean status;

            public void setTngou(List<TngouEntity> tngou) {
                this.tngou = tngou;
            }

            public void setStatus(boolean status) {
                this.status = status;
            }

            public List<TngouEntity> getTngou() {
                return tngou;
            }

            public boolean isStatus() {
                return status;
            }

            public static class TngouEntity {
                /**
                 * keywords : 社会热点
                 * name : 社会热点
                 * description : 社会热点，健康资讯，综合健康资讯,生活热点新闻,社会热点新闻,社会热点查询,提供最新的健康资讯,社会热点新闻网
                 * id : 6
                 * title : 社会热点
                 * seq : 1
                 */
                private String keywords;
                private String name;
                private String description;
                private int id;
                private String title;
                private int seq;

                public void setKeywords(String keywords) {
                    this.keywords = keywords;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public void setDescription(String description) {
                    this.description = description;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public void setSeq(int seq) {
                    this.seq = seq;
                }

                public String getKeywords() {
                    return keywords;
                }

                public String getName() {
                    return name;
                }

                public String getDescription() {
                    return description;
                }

                public int getId() {
                    return id;
                }

                public String getTitle() {
                    return title;
                }

                public int getSeq() {
                    return seq;
                }
            }
        }
    }
}
