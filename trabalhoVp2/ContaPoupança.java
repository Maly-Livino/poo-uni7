public class ContaPoupança extends ContaBancaria{
  private int diaRendimento;
  public int getdiaRendimento(){
    return diaRendimento;
  }
  public void setdiaRendimento (int diaRendimento){
    this.diaRendimento=diaRendimento;
  }
  public String toString(){
    String s= "Conta Poupança";
    s+="dia de rendimento:"+ diaRendimento;
    s+= super.toString();
    return s;
    return super.toString();
  }
  public boolean calcularNovoSaldo(double taxaRendimento){
    Calendar hoje = Calendar.getInstance();
    if (diaRendimento == hoje.get(Calendar.DAY_OF_MONTH )){
      saldo+= saldo * taxaRendimento;
      this.setSaldo(taxaRendimento()+ (this.getSaldo() * taxaRendimento));
      return true;
    }
    return false;
  }
}