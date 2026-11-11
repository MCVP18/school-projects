/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package umsl.edu;

import java.util.StringTokenizer;

/**
 *
 * @author New
 */
public class TestRun {

  private final String data;

  public TestRun(String d) {
    data = d;
  }

  public int count() {
    int num = 0;
    StringTokenizer st = new StringTokenizer(data);
    while (st.hasMoreTokens()) {
      num++;
      st.nextToken();
    }
    return num;
  }



  public int sum() {
    int su = 0;
    StringTokenizer st = new StringTokenizer(data);
    while (st.hasMoreTokens()) {
      su += Integer.parseInt(st.nextToken());
    }
    return su;
  }

  public double average() {
    return ((double)sum())/count();
  }

  public int minimum() {
    int min = Integer.MAX_VALUE;
    int d;
    StringTokenizer st = new StringTokenizer(data);
    while (st.hasMoreTokens()) { //exploits that there is at least one data
      d = Integer.parseInt(st.nextToken());
      if (d < min) min = d;
    }
    return min;
  }

  public int maximum() {
    int max = Integer.MIN_VALUE;
    int d;
    StringTokenizer st = new StringTokenizer(data);
    while (st.hasMoreTokens()) { //exploits that there is at least one data
      d = Integer.parseInt(st.nextToken());
      if (d > max) max = d;
    }
    return max;
  }
}
    

