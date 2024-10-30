package br.edu.ifpb.pweb2.projeto.lensconnect.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
@Table(name = "photo_tag")
public class PhotoTag {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


     @ManyToOne  // uma tag de foto esta associada a uma photo especifica.
     @JoinColumn(name = "photo_id")
      private Photo photo;

     @ManyToOne // uma tag de foto é associada a uma unica tag
     @JoinColumn(name = "tag_id")
     private Tag tag;



}
