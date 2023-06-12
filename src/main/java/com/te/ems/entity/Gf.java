package com.te.ems.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Entity
public class Gf {
	@Id
	private Integer gfId;
	private String gfName;
	
	
	//@ManyToOne
	//@JoinColumn(name = "ravi_fk")
	//@JoinTable(name = "gf_ravi_details",joinColumns = @JoinColumn(name="gf_id_fk"),inverseJoinColumns =@JoinColumn(name="ravi_id_fk"))
	@ManyToMany(mappedBy = "gf")
	private List<Ravi> ravi;
}
