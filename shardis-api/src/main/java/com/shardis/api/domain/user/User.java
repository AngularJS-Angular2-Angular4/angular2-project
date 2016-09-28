package com.shardis.api.domain.user;

import com.shardis.api.domain.base.AuditedEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Tomasz Kucharzyk
 */
@Entity
@Table(name = "USER")
public class User extends AuditedEntity {

}
