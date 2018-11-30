package com.lj.neusoft.util;

import java.util.List;

public class Page<T> {

    private int pageSize = 5;
    private int totalCount;
    private int totalpage;
    private int curenPage = 1;
    private int nextpage;
    private int prePage;
    private int firstpage;
    private int lastpage;

    private List<T> arrys; //从数据库查询出来的结果集

    public List<T> getArrys() {
        return arrys;
    }

    public void setArrys(List<T> arrys) {
        this.arrys = arrys;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    /**
     * 总共分多少页
     * @return
     */
    public int getTotalpage() {
        if(totalCount%pageSize==0)
            return totalCount/pageSize;
        else
            return totalCount/pageSize+1;
    }

    public int getCurenPage() {
        return curenPage;
    }

    public void setCurenPage(int curenPage) {
        this.curenPage = curenPage;
    }

    /**
     * 下一页
     * @return
     */
    public int getNextpage() {
        if(curenPage<this.getTotalpage())
            return curenPage+1;
        else
            return this.getTotalpage();
    }

    /***
     * 上一页
     * @param
     */
    public int getPrePage() {
        if(curenPage>1)
            return curenPage-1;
        else
            return this.getFirstpage();
    }

    /**
     * 首页
     * @return
     */
    public int getFirstpage() {
        return 1;
    }

    /**
     * 尾页
     * @return
     */
    public int getLastpage() {
        return this.getTotalpage();
    }
}
