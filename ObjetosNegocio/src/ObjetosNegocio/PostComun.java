/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObjetosNegocio;

import java.io.Serializable;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Juan Enrique Solis Perla, ID: 165920
 */
@Entity
@DiscriminatorValue( value="PC" )
public class PostComun extends Post {

//    @ManyToOne()
//    @JoinColumn(name = "usuario_id", nullable = false)
//    private Usuario usuario;
    
}
