/**
 * @author (c) 2018, Chen_9g 陈刚 (80588183@qq.com).
 * @date 2018-10-20  下午10:00
 *
 * <p>
 * Find a way for success and not make excuses for failure.
 * </p>
 */

package org.jleopard.entity;


import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "t_user")
public class User {

    @Id
    @GeneratedValue(generator="_native")
    @GenericGenerator(name="_native", strategy="native")
    private Integer id;

    private String name;

    private String address;

    private String phone;

    @ManyToMany(targetEntity = Role.class)
    @JoinTable(name = "t_user_role", joinColumns = { @JoinColumn(name = "uid", referencedColumnName = "id") }, inverseJoinColumns = { @JoinColumn(name = "rid", referencedColumnName = "id") })
    @Cascade(value = {CascadeType.SAVE_UPDATE,CascadeType.DELETE})
    private Set<Role> roleSet = new HashSet<>();

    public User() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Set<Role> getRoleSet() {
        return roleSet;
    }

    public void setRoleSet(Set<Role> roleSet) {
        this.roleSet = roleSet;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", roleSet=" + roleSet +
                '}';
    }
}
