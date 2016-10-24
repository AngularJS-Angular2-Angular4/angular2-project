package com.centurylink.pctl.mod.cart.domain.cart;

/**
 * Created by nagavenkatakirang on 21-10-2016.
 */
public class Contact
{
    private String email;

    private String name;

    private String lastname;

    private String firstname;

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

    public String getLastname ()
    {
        return lastname;
    }

    public void setLastname (String lastname)
    {
        this.lastname = lastname;
    }

    public String getFirstname ()
    {
        return firstname;
    }

    public void setFirstname (String firstname)
    {
        this.firstname = firstname;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [email = "+email+", name = "+name+", lastname = "+lastname+", firstname = "+firstname+"]";
    }
}
