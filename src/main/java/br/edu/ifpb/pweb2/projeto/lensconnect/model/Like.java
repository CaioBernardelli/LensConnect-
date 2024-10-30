package br.edu.ifpb.pweb2.projeto.lensconnect.model;

import jakarta.persistence.*;
import lombok.Generated;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "photo_like")
public class Like {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @ManyToOne
    @JoinColumn(name = "photo_id")
    private Photo photo;// Um like está vinculado a só uma foto
// sem necessidade de ter uma lista de likes na class photo, cada like sabe qual photo pertence.


    @ManyToOne
    @JoinColumn(name = "photographer_id")//// Um like e dado por im único fotografo
    private Photographer photographer;





    }

