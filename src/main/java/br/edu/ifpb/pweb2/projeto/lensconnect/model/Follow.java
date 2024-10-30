package br.edu.ifpb.pweb2.projeto.lensconnect.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
@Table(name = "follow")
public class Follow {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @ManyToOne @JoinColumn(name = "follower_id")//Um registro de "seguir" está vinculado ao fotógrafo que está seguindo.
    private Photographer follower;



    @ManyToOne @JoinColumn(name = "followee_id")//Um registro de "seguir" está vinculado ao fotógrafo que está seguindo.
    private Photographer followee;//Um registro de "seguir" está vinculado ao fotógrafo que está sendo seguido.


}
