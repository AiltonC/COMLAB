package proyecto.ponti.CONLAB.controller.dto;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;
import proyecto.ponti.CONLAB.model.*;


import java.util.Date;

@Data
public class AlumnoDTO {

    @NotBlank
    @Size(min = 3, max = 25)
    private String codigo;

    @NotBlank
    private String nomalumno;

    @NotBlank
    private String appaterno;

    @NotBlank
    private String apmaterno;
    @NotBlank
    private String celular;
    @NotBlank
    private String correo;
    @NotBlank
    @OneToOne
    @JoinColumn(name = "idcarrera")
    private Carrera idcarrera;
    @NotBlank
    @OneToOne
    @JoinColumn(name = "idciclo")
    private Ciclo idciclo;
    @NotBlank
    @OneToOne
    @JoinColumn(name = "idcurso")
    private Curso idcurso;
    @NotBlank
    @OneToOne
    @JoinColumn(name = "idequipo")
    private Equipo idequipo;
    @NotBlank
    @OneToOne
    @JoinColumn(name = "idgestudio")
    private Gestudio idgestudio;
}
