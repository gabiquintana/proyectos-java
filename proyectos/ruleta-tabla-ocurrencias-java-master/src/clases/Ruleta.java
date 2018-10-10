/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Random;
import java.util.Vector;
import javax.swing.RowSorter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Virtual
 */
public class Ruleta 
{
    private int numeroActual;
    private int numeroAnterior;
    
    private int[] post0 = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0} ;
    private int[] post1 = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0} ;
    private int[] post2 = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0} ;
    private int[] post3 = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0} ;
    private int[] post4 = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0} ;
    private int[] post5 = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0} ;
    private int[] post6 = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0} ;
    private int[] post7 = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0} ;
    private int[] post8 = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0} ;
    private int[] post9 = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0} ;
    private int[] post10 = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0} ;
    private int[] post11 = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0} ;
    private int[] post12 = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0} ;
    private int[] post13 = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0} ;
    private int[] post14 = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0} ;
    private int[] post15 = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0} ;
    private int[] post16 = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0} ;
    private int[] post17 = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0} ;
    private int[] post18 = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0} ;
    private int[] post19 = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0} ;
    private int[] post20 = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0} ;
    private int[] post21 = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0} ;
    private int[] post22 = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0} ;
    private int[] post23 = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0} ;
    private int[] post24 = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0} ;
    private int[] post25 = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0} ;
    private int[] post26 = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0} ;
    private int[] post27 = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0} ;
    private int[] post28 = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0} ;
    private int[] post29 = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0} ;
    private int[] post30 = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0} ;
    private int[] post31 = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0} ;
    private int[] post32 = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0} ;
    private int[] post33 = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0} ;
    private int[] post34 = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0} ;
    private int[] post35 = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0} ;
    private int[] post36 = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0} ;
    
    private ArrayList<Integer> numerosGenerados = new ArrayList<Integer>();
    
    public Ruleta() 
    {
        
    }
    
    public void generarNumeros(int cantidad)
    {
        Random azar = new Random();
        
        this.numeroAnterior = (int) (azar.nextDouble() * 37);
        this.numerosGenerados.add(numeroAnterior);
        
        for (int i = 1; i < cantidad; i++) 
        {
            this.numeroActual = (int) (azar.nextDouble() * 37);
            this.numerosGenerados.add(numeroActual);
            
            switch (numeroAnterior)
            {
                case 0: post0[numeroActual]++; break;
                case 1: post1[numeroActual]++; break;
                case 2: post2[numeroActual]++; break;
                case 3: post3[numeroActual]++; break;
                case 4: post4[numeroActual]++; break;
                case 5: post5[numeroActual]++; break;
                case 6: post6[numeroActual]++; break;
                case 7: post7[numeroActual]++; break;
                case 8: post8[numeroActual]++; break;
                case 9: post9[numeroActual]++; break;
                case 10: post10[numeroActual]++; break;
                case 11: post11[numeroActual]++; break;
                case 12: post12[numeroActual]++; break;
                case 13: post13[numeroActual]++; break;
                case 14: post14[numeroActual]++; break;
                case 15: post15[numeroActual]++; break;
                case 16: post16[numeroActual]++; break;
                case 17: post17[numeroActual]++; break;
                case 18: post18[numeroActual]++; break;
                case 19: post19[numeroActual]++; break;
                case 20: post20[numeroActual]++; break;
                case 21: post21[numeroActual]++; break;
                case 22: post22[numeroActual]++; break;
                case 23: post23[numeroActual]++; break;
                case 24: post24[numeroActual]++; break;
                case 25: post25[numeroActual]++; break;
                case 26: post26[numeroActual]++; break;
                case 27: post27[numeroActual]++; break;
                case 28: post28[numeroActual]++; break;
                case 29: post29[numeroActual]++; break;
                case 30: post30[numeroActual]++; break;
                case 31: post31[numeroActual]++; break;
                case 32: post32[numeroActual]++; break;
                case 33: post33[numeroActual]++; break;
                case 34: post34[numeroActual]++; break;
                case 35: post35[numeroActual]++; break;
                case 36: post36[numeroActual]++; break;
            }
            
            this.numeroAnterior = this.numeroActual;
        }
        
    }
    
    public void generarNumeros(ArrayList<Integer> array)
    {
        if (array != null) 
        {
            this.numerosGenerados = array;
            this.numeroAnterior = this.numerosGenerados.get(0);
        
            for (int i = 1; i < this.numerosGenerados.size(); i++) 
            {
                this.numeroActual = this.numerosGenerados.get(i);

                switch (numeroAnterior)
                {
                    case 0: post0[numeroActual]++; break;
                    case 1: post1[numeroActual]++; break;
                    case 2: post2[numeroActual]++; break;
                    case 3: post3[numeroActual]++; break;
                    case 4: post4[numeroActual]++; break;
                    case 5: post5[numeroActual]++; break;
                    case 6: post6[numeroActual]++; break;
                    case 7: post7[numeroActual]++; break;
                    case 8: post8[numeroActual]++; break;
                    case 9: post9[numeroActual]++; break;
                    case 10: post10[numeroActual]++; break;
                    case 11: post11[numeroActual]++; break;
                    case 12: post12[numeroActual]++; break;
                    case 13: post13[numeroActual]++; break;
                    case 14: post14[numeroActual]++; break;
                    case 15: post15[numeroActual]++; break;
                    case 16: post16[numeroActual]++; break;
                    case 17: post17[numeroActual]++; break;
                    case 18: post18[numeroActual]++; break;
                    case 19: post19[numeroActual]++; break;
                    case 20: post20[numeroActual]++; break;
                    case 21: post21[numeroActual]++; break;
                    case 22: post22[numeroActual]++; break;
                    case 23: post23[numeroActual]++; break;
                    case 24: post24[numeroActual]++; break;
                    case 25: post25[numeroActual]++; break;
                    case 26: post26[numeroActual]++; break;
                    case 27: post27[numeroActual]++; break;
                    case 28: post28[numeroActual]++; break;
                    case 29: post29[numeroActual]++; break;
                    case 30: post30[numeroActual]++; break;
                    case 31: post31[numeroActual]++; break;
                    case 32: post32[numeroActual]++; break;
                    case 33: post33[numeroActual]++; break;
                    case 34: post34[numeroActual]++; break;
                    case 35: post35[numeroActual]++; break;
                    case 36: post36[numeroActual]++; break;
                }

                this.numeroAnterior = this.numeroActual;
            }
        }
    }
    

    public int getNumeroActual() {
        return numeroActual;
    }

    public void setNumeroActual(int numeroActual) {
        this.numeroActual = numeroActual;
    }

    public int getNumeroAnterior() {
        return numeroAnterior;
    }

    public void setNumeroAnterior(int numeroAnterior) {
        this.numeroAnterior = numeroAnterior;
    }

    public int[] getPost0() {
        return post0;
    }

    public void setPost0(int[] post0) {
        this.post0 = post0;
    }

    public int[] getPost1() {
        return post1;
    }

    public void setPost1(int[] post1) {
        this.post1 = post1;
    }

    public int[] getPost2() {
        return post2;
    }

    public void setPost2(int[] post2) {
        this.post2 = post2;
    }

    public int[] getPost3() {
        return post3;
    }

    public void setPost3(int[] post3) {
        this.post3 = post3;
    }

    public int[] getPost4() {
        return post4;
    }

    public void setPost4(int[] post4) {
        this.post4 = post4;
    }

    public int[] getPost5() {
        return post5;
    }

    public void setPost5(int[] post5) {
        this.post5 = post5;
    }

    public int[] getPost6() {
        return post6;
    }

    public void setPost6(int[] post6) {
        this.post6 = post6;
    }

    public int[] getPost7() {
        return post7;
    }

    public void setPost7(int[] post7) {
        this.post7 = post7;
    }

    public int[] getPost8() {
        return post8;
    }

    public void setPost8(int[] post8) {
        this.post8 = post8;
    }

    public int[] getPost9() {
        return post9;
    }

    public void setPost9(int[] post9) {
        this.post9 = post9;
    }

    public int[] getPost10() {
        return post10;
    }

    public void setPost10(int[] post10) {
        this.post10 = post10;
    }

    public int[] getPost11() {
        return post11;
    }

    public void setPost11(int[] post11) {
        this.post11 = post11;
    }

    public int[] getPost12() {
        return post12;
    }

    public void setPost12(int[] post12) {
        this.post12 = post12;
    }

    public int[] getPost13() {
        return post13;
    }

    public void setPost13(int[] post13) {
        this.post13 = post13;
    }

    public int[] getPost14() {
        return post14;
    }

    public void setPost14(int[] post14) {
        this.post14 = post14;
    }

    public int[] getPost15() {
        return post15;
    }

    public void setPost15(int[] post15) {
        this.post15 = post15;
    }

    public int[] getPost16() {
        return post16;
    }

    public void setPost16(int[] post16) {
        this.post16 = post16;
    }

    public int[] getPost17() {
        return post17;
    }

    public void setPost17(int[] post17) {
        this.post17 = post17;
    }

    public int[] getPost18() {
        return post18;
    }

    public void setPost18(int[] post18) {
        this.post18 = post18;
    }

    public int[] getPost19() {
        return post19;
    }

    public void setPost19(int[] post19) {
        this.post19 = post19;
    }

    public int[] getPost20() {
        return post20;
    }

    public void setPost20(int[] post20) {
        this.post20 = post20;
    }

    public int[] getPost21() {
        return post21;
    }

    public void setPost21(int[] post21) {
        this.post21 = post21;
    }

    public int[] getPost22() {
        return post22;
    }

    public void setPost22(int[] post22) {
        this.post22 = post22;
    }

    public int[] getPost23() {
        return post23;
    }

    public void setPost23(int[] post23) {
        this.post23 = post23;
    }

    public int[] getPost24() {
        return post24;
    }

    public void setPost24(int[] post24) {
        this.post24 = post24;
    }

    public int[] getPost25() {
        return post25;
    }

    public void setPost25(int[] post25) {
        this.post25 = post25;
    }

    public int[] getPost26() {
        return post26;
    }

    public void setPost26(int[] post26) {
        this.post26 = post26;
    }

    public int[] getPost27() {
        return post27;
    }

    public void setPost27(int[] post27) {
        this.post27 = post27;
    }

    public int[] getPost28() {
        return post28;
    }

    public void setPost28(int[] post28) {
        this.post28 = post28;
    }

    public int[] getPost29() {
        return post29;
    }

    public void setPost29(int[] post29) {
        this.post29 = post29;
    }

    public int[] getPost30() {
        return post30;
    }

    public void setPost30(int[] post30) {
        this.post30 = post30;
    }

    public int[] getPost31() {
        return post31;
    }

    public void setPost31(int[] post31) {
        this.post31 = post31;
    }

    public int[] getPost32() {
        return post32;
    }

    public void setPost32(int[] post32) {
        this.post32 = post32;
    }

    public int[] getPost33() {
        return post33;
    }

    public void setPost33(int[] post33) {
        this.post33 = post33;
    }

    public int[] getPost34() {
        return post34;
    }

    public void setPost34(int[] post34) {
        this.post34 = post34;
    }

    public int[] getPost35() {
        return post35;
    }

    public void setPost35(int[] post35) {
        this.post35 = post35;
    }

    public int[] getPost36() {
        return post36;
    }

    public void setPost36(int[] post36) {
        this.post36 = post36;
    }

    public ArrayList<Integer> getNumerosGenerados() {
        return numerosGenerados;
    }

    public void setNumerosGenerados(ArrayList<Integer> numerosGenerados) {
        this.numerosGenerados = numerosGenerados;
    }
    
    
    
}
