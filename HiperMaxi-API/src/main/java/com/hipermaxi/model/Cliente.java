package com.hipermaxi.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tb_cliente")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cliente")
    private Long id;

    @OneToOne
    @JoinColumn(name = "id_tipoDoc")
    private TipoDocumento tipoDocumento;



    @Column(name ="num_documento", length = 50, nullable = false)
    private String num_documento;

    @Column(name ="nombre", length = 200, nullable = false)
    private String nombre;

    @Column( name ="ape_pat",    length = 200, nullable = false)
    private String ape_pat;

    @Column( name ="ape_mat",   length = 200, nullable = false)
    private String ape_mat;

    @Column(name="fec_nacimiento", nullable = false)
    @Temporal(value= TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date fec_nacimiento;

    @Column(  name ="email",       length = 200, nullable = false)
    private String email;





}
