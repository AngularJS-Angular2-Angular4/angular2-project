package com.centurylink.pctl.mod.product.domain.product;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


import java.io.Serializable;
import java.util.List;

/**
 * Created by begin.samuel on 10/4/2016.
 */


@Document(collection="products")
public class Product implements Serializable {

        private String updatedAt;

        private String discriptionHtml;
        private String displayImage;

        @Id
        private String _id;


        private String createdAt;

        private List<Terms> terms;

        private String name;


        private List<ProductVariants> productVariants;


        private String productType;

        private String productId;

        public String getUpdatedAt ()
        {
            return updatedAt;
        }

        public void setUpdatedAt (String updatedAt)
        {
            this.updatedAt = updatedAt;
        }

        public String getDiscriptionHtml ()
        {
            return discriptionHtml;
        }

        public void setDiscriptionHtml (String discriptionHtml)
        {
            this.discriptionHtml = discriptionHtml;
        }

        public String get_id ()
        {
            return _id;
        }

        public void set_id (String id)
        {
            this._id = id;
        }

        public String getDisplayImage ()
        {
            return displayImage;
        }

        public void setDisplayImage (String displayImage)
        {
            this.displayImage = displayImage;
        }

        public String getCreatedAt ()
        {
            return createdAt;
        }

        public void setCreatedAt (String createdAt)
        {
            this.createdAt = createdAt;
        }

        public List<Terms> getTerms ()
        {
            return terms;
        }

        public void setTerms (List<Terms> terms)
        {
            this.terms = terms;
        }

        public String getName ()
        {
            return name;
        }

        public void setName (String name)
        {
            this.name = name;
        }


        public List<ProductVariants> getProductVariants ()
        {
            return productVariants;
        }

        public void setVariants (List<ProductVariants> variants)
        {
            this.productVariants = productVariants;
        }


        public String getProductType ()
        {
            return productType;
        }

        public void setProductType (String productType)
        {
            this.productType = productType;
        }

        public String getProductId ()
        {
            return productId;
        }

        public void setProductId (String productId)
        {
            this.productId = productId;
        }

        @Override
        public String toString()
        {
            return "Product {" +
                "updatedAt = "+updatedAt+", " +
                "discriptionHtml = "+discriptionHtml+"," +
                " _id = "+_id+", " +
                "displayImage = "+displayImage+", " +
                "createdAt = "+createdAt+", " +
                "terms = "+terms+"," +
                "name = "+name+", " +
                "variants = "+productVariants+"," +
                "productType = "+productType+"," +
                "productId = "+productId+"}";
        }
}
