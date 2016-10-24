package com.centurylink.pctl.mod.cart.domain.cart;

/**
 * Created by nagavenkatakirang on 21-10-2016.
 */
public class User
{
    private String email;

    private String name;

    public String getEmail ()
    {
        return email;
    }

    public void setEmail (String email)
    {
        this.email = email;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    @Override
    public String toString()
    {
        return "User [email = "+email+", name = "+name+"]";
    }
}
