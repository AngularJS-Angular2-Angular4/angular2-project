package com.centurylink.pctl.mod.api.domain.product;

/**
 * Created by begin.samuel on 10/14/2016.
 */
public class PriceInfo {


    private String term;

    private String ctl;

    private String own;

    public String getTerm ()
    {
        return term;
    }

    public void setTerm (String term)
    {
        this.term = term;
    }

    public String getCtl ()
    {
        return ctl;
    }

    public void setCtl (String ctl)
    {
        this.ctl = ctl;
    }

    public String getOwn ()
    {
        return own;
    }

    public void setOwn (String own)
    {
        this.own = own;
    }

    @Override
    public String toString()
    {
        return "Price [term = "+term+", ctl = "+ctl+", own = "+own+"]";
    }


}
