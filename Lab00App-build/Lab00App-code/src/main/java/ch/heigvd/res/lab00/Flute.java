<<<<<<< HEAD
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
=======
>>>>>>> upstream/with-bdd
package ch.heigvd.res.lab00;

/**
 *
 * @author Olivier Liechti
 */
public class Flute implements IInstrument {

  @Override
  public String play() {
    return "piout";
  }

  @Override
  public int getSoundVolume() {
    return 100;
  }

  @Override
  public String getColor() {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }
}
