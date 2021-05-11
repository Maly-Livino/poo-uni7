public class ContaBancaria {
  private String nomeCliente;
  private String tipoconta;
  private double saldo;
  private String dataabertura;
  
  public String getTipoconta(){
    return tipoconta;
  }
  public void setTipoconta(String tipoconta){
    this.tipoconta= tipoconta;
  }
  public String getnomeCliente(){
    return nomeCliente;
  }
  public void setnomeClient(String nomeCliente){
    this.nomeCliente= nomeCliente;
  }
  public String getdataabertura(){
    return dataabertura;
  }
  public void setdataabertura(String dataabertura){
    this.dataabertura= dataabertura;
  }
  public double getsaldo (){
    return saldo;
  }
  public void setsaldo(double saldo){
    this.saldo= saldo;
  }
  public String toString(){
    return super. to String();
  }
  public void depositar (double valor){
    saldo += valor;

  }
  
  public String sacar (double valor){
    if (valor< saldo){
      saldo= saldo-valor;
      return "Saque Realizado";
    }else{
      return "Saldo insuficiente";
    }
  }
   
}