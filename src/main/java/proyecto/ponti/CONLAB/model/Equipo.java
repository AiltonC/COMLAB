package proyecto.ponti.CONLAB.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Equipo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idequipo")
    private Integer id;

    private String nomequipo;

    @OneToMany
    @JoinColumn(name = "idequipo")
    private Equipo idequipo;

    @ManyToMany
    @JoinColumn(name = "idcomp")
    private Componente idcomp;
}
