import java.time.LocalDate;

public abstract class Veiculo {

      private String cor;
      private String Marca;
      private Array Tanque; 
      private enum direction{
        Direita
        Esquerda
      } 

      private enum FarolState{
        Desligado
        FarolBaixo
        FarolAlto
      } 

     private enum InternalSetStatefarol( enum FarolState ){

     } 

     private direction InternalSetDirection( enum direction ){
      return direction; 
      // tem que me devolver direta ou esquerda
     }   

     private Boolean InternalLigarCarro(){
         
     } 

     private Boolean InternalDesligarCarro(){

     }

     private Boolean InternalAbastecer(){

     } 

    public Veiculo(String cor, String Marca) {
        
    }

   public Boolean Ligar(){     
     return InternalLigarCarro(); 
   }

   public Boolean Desligar(){     
      return  InternalDesligarCarro();

   public Boolean Abastecer(){
      return InternalAbastecer();
   }

   public enum Seta(){
    return InternalSetDirection();

   }

   public Veiculo Farol ( enum FarolState ){
    return InternalSetStatefarol();
      
   }

}