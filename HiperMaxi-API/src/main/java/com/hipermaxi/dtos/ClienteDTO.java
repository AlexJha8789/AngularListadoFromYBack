package com.hipermaxi.dtos;

import com.hipermaxi.model.TipoDocumento;
import lombok.Getter;
import lombok.Setter;



import java.util.Date;

@Getter
@Setter
public class ClienteDTO {

    private Long id;

    private TipoDocumento tipoDocumento;

    private String num_documento;

    private String nombre;

    private String ape_pat;

    private String ape_mat;

    private Date fec_nacimiento;

    private String email;

}
