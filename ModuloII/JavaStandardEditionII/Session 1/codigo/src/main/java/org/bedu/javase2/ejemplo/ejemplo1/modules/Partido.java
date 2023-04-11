package org.bedu.javase2.ejemplo.ejemplo1.modules;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "partidos")
public class Partido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    private int marcador_equipo_1;
    private int marcador_equipo_2;
    @ManyToOne
    @JoinColumn(name = "equipos1_fk", referencedColumnName = "id")
    private Equipo equipos1_fk;
    @ManyToOne
    @JoinColumn(name = "equipos2_fk", referencedColumnName = "id")
    private Equipo equipos2_fk;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getMarcador_equipo_1() {
        return marcador_equipo_1;
    }

    public void setMarcador_equipo_1(int marcador_equipo_1) {
        this.marcador_equipo_1 = marcador_equipo_1;
    }

    public int getMarcador_equipo_2() {
        return marcador_equipo_2;
    }

    public void setMarcador_equipo_2(int marcador_equipo_2) {
        this.marcador_equipo_2 = marcador_equipo_2;
    }

    public Equipo getEquipos1_fk() {
        return equipos1_fk;
    }

    public void setEquipos1_fk(Equipo equipos1_fk) {
        this.equipos1_fk = equipos1_fk;
    }

    public Equipo getEquipos2_fk() {
        return equipos2_fk;
    }

    public void setEquipos2_fk(Equipo equipos2_fk) {
        this.equipos2_fk = equipos2_fk;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Partido partido = (Partido) o;
        return marcador_equipo_1 == partido.marcador_equipo_1
                && marcador_equipo_2 == partido.marcador_equipo_2
                && Objects.equals(id, partido.id)
                && Objects.equals(equipos1_fk, partido.equipos1_fk)
                && Objects.equals(equipos2_fk, partido.equipos2_fk);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, marcador_equipo_1, marcador_equipo_2, equipos1_fk, equipos2_fk);
    }
}
