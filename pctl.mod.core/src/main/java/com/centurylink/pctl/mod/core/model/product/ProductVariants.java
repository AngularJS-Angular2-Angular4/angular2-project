package com.centurylink.pctl.mod.core.model.product;

/**
 * Created by begin.samuel on 10/5/2016.
 */
public class ProductVariants  {



    private String haServiceVendor;
    private String securityPkg;

    private String displayImage;

    private String serviceVendor;

    private String tier1Support;

    private String haSecurityPkg;

    private String serviceTransport;

    private String variantId;

    private String sku;

    private String productId;

    private String descriptionHtml;

    private String updatedAt;

    private String displayPosition;

    private String haCpe;

    private String haServicePlan;

    private String createdAt;

    private String name;

    private String servicePlan;

    private String haServiceTransport;


    public String getStandardCpe() {
        return standardCpe;
    }

    public void setStandardCpe(String standardCpe) {
        this.standardCpe = standardCpe;
    }

    private String standardCpe;

    public String getHaServiceVendor ()
    {
        return haServiceVendor;
    }

    public void setHaServiceVendor (String haServiceVendor)
    {
        this.haServiceVendor = haServiceVendor;
    }

    public String getSecurityPkg ()
    {
        return securityPkg;
    }

    public void setSecurityPkg (String securityPkg)
    {
        this.securityPkg = securityPkg;
    }

    public String getDisplayImage ()
    {
        return displayImage;
    }

    public void setDisplayImage (String displayImage)
    {
        this.displayImage = displayImage;
    }

    public String getServiceVendor ()
    {
        return serviceVendor;
    }

    public void setServiceVendor (String serviceVendor)
    {
        this.serviceVendor = serviceVendor;
    }

    public String getTier1Support ()
    {
        return tier1Support;
    }

    public void setTier1Support (String tier1Support)
    {
        this.tier1Support = tier1Support;
    }

    public String getHaSecurityPkg ()
    {
        return haSecurityPkg;
    }

    public void setHaSecurityPkg (String haSecurityPkg)
    {
        this.haSecurityPkg = haSecurityPkg;
    }

    public String getServiceTransport ()
    {
        return serviceTransport;
    }

    public void setServiceTransport (String serviceTransport)
    {
        this.serviceTransport = serviceTransport;
    }

    public String getVariantId ()
    {
        return variantId;
    }

    public void setVariantId (String variantId)
    {
        this.variantId = variantId;
    }

    public String getSku ()
    {
        return sku;
    }

    public void setSku (String sku)
    {
        this.sku = sku;
    }

    public String getProductId ()
    {
        return productId;
    }

    public void setProductId (String productId)
    {
        this.productId = productId;
    }

    public String getDescriptionHtml ()
    {
        return descriptionHtml;
    }

    public void setDescriptionHtml (String descriptionHtml)
    {
        this.descriptionHtml = descriptionHtml;
    }

    public String getUpdatedAt ()
    {
        return updatedAt;
    }

    public void setUpdatedAt (String updatedAt)
    {
        this.updatedAt = updatedAt;
    }

    public String getDisplayPosition ()
    {
        return displayPosition;
    }

    public void setDisplayPosition (String displayPosition)
    {
        this.displayPosition = displayPosition;
    }

    public String getHaCpe ()
    {
        return haCpe;
    }

    public void setHaCpe (String haCpe)
    {
        this.haCpe = haCpe;
    }

    public String getHaServicePlan ()
    {
        return haServicePlan;
    }

    public void setHaServicePlan (String haServicePlan)
    {
        this.haServicePlan = haServicePlan;
    }

    public String getCreatedAt ()
    {
        return createdAt;
    }

    public void setCreatedAt (String createdAt)
    {
        this.createdAt = createdAt;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String getServicePlan ()
    {
        return servicePlan;
    }

    public void setServicePlan (String servicePlan)
    {
        this.servicePlan = servicePlan;
    }

    public String getHaServiceTransport ()
    {
        return haServiceTransport;
    }

    public void setHaServiceTransport (String haServiceTransport)
    {
        this.haServiceTransport = haServiceTransport;
    }


    @Override
    public String toString()
    {
        return "ProductVariants [haServiceVendor = "+haServiceVendor+", securityPkg = "+securityPkg+", displayImage = "+displayImage+", serviceVendor = "+serviceVendor+", tier1Support = "+tier1Support+", haSecurityPkg = "+haSecurityPkg+", serviceTransport = "+serviceTransport+", variantId = "+variantId+", sku = "+sku+", productId = "+productId+", descriptionHtml = "+descriptionHtml+", updatedAt = "+updatedAt+", displayPosition = "+displayPosition+", haCpe = "+haCpe+", haServicePlan = "+haServicePlan+", createdAt = "+createdAt+", name = "+name+", servicePlan = "+servicePlan+", haServiceTransport = "+haServiceTransport+", standardCpe = "+
            standardCpe+"]";
    }
}

