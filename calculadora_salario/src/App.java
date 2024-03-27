public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Salário CLT");

        double salarioBruto = 2500;
        double inssAliquota = 0.08;
        double inss = salarioBruto * inssAliquota;
        double valeTransporte = 0.06 * salarioBruto;
        double salarioLiquidoMensal = salarioBruto - inss - valeTransporte;

        double ferias = salarioBruto / 3;
        double decimoTerceiro = salarioBruto / 12;
        double plr = salarioBruto * 0.15;
        double fgts = salarioBruto * 0.08;

        double salarioAnual = salarioLiquidoMensal * 12 + ferias + decimoTerceiro + plr + fgts;


        System.out.println("Salário Bruto: " + salarioBruto);
        System.out.println("Salário Anual: " + salarioAnual);
        System.out.println("Anual por mês: " + salarioAnual / 12);

    }
}
