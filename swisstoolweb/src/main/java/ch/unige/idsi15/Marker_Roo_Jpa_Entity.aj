// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package ch.unige.idsi15;

import ch.unige.idsi15.Marker;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;

privileged aspect Marker_Roo_Jpa_Entity {
    
    declare @type: Marker: @Entity;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long Marker.id;
    
    @Version
    @Column(name = "version")
    private Integer Marker.version;
    
    public Long Marker.getId() {
        return this.id;
    }
    
    public void Marker.setId(Long id) {
        this.id = id;
    }
    
    public Integer Marker.getVersion() {
        return this.version;
    }
    
    public void Marker.setVersion(Integer version) {
        this.version = version;
    }
    
}
