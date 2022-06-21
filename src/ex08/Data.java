package ex08;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;

        if (this.ano < 1 ||
                this.dia < 1 || this.dia > getQtdDiasMes() ||
                this.mes < 1 || this.mes > 12) {
            this.dia = this.ano = this.mes = 1;
        }
    }

    /* Verifica se o ano é bissexto */
    private boolean isBissexto() {
        if ((this.ano % 4 == 0) && (this.ano % 100 != 0)) {
            return true;
        }
        return false;
    }

    /* Retorna a quantidade máxima de dias do mês */
    private int getQtdDiasMes() {
        if (this.mes < 8) {
            if (this.mes == 2) {
                if (isBissexto()) {
                    return 29;
                } else {
                    return 28;
                }
            } else if (this.mes % 2 == 0) {
                return 30;
            } else {
                return 31;
            }
        } else if (this.mes < 13) {
            if (this.mes % 2 == 0) {
                return 31;
            } else {
                return 30;
            }
        }
        return 0;
    }

    /* Comparar datas */
    public int compare(Data d) {
        if (this.ano > d.ano) {
            return 1;
        } else if (this.ano == d.ano) {
            if (this.mes > d.mes) {
                return 1;
            } else if (this.mes == d.mes) {
                if (this.dia > d.dia) {
                    return 1;
                } else if (this.dia == d.dia) {
                    return 0;
                }
            }
        }
        return -1;
    }

    public Data clone() {
        Data nova = new Data(this.dia, this.mes, this.ano);
        return nova;
    }

    @Override
    public String toString() {
        return "Data [ano=" + ano + ", dia=" + dia + ", mes=" + mes + "]";
    }

    public String getMexExtenso() {
        String[] meses = {
                "Janeiro",
                "Fevereiro",
                "Março",
                "Abril",
                "Maio",
                "Junho",
                "Julho",
                "Agosto",
                "Setembro",
                "Outubro",
                "Novembro",
                "Dezembro"
        };

        return meses[this.mes - 1];
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

}
