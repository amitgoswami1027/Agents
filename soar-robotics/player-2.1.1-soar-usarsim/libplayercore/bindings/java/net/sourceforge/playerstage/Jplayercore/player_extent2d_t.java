/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.33
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.sourceforge.playerstage.Jplayercore;

public class player_extent2d_t {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected player_extent2d_t(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(player_extent2d_t obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if(swigCPtr != 0 && swigCMemOwn) {
      swigCMemOwn = false;
      playercore_javaJNI.delete_player_extent2d_t(swigCPtr);
    }
    swigCPtr = 0;
  }

  protected static long[] cArrayUnwrap(player_extent2d_t[] arrayWrapper) {
      long[] cArray = new long[arrayWrapper.length];
      for (int i=0; i<arrayWrapper.length; i++)
        cArray[i] = player_extent2d_t.getCPtr(arrayWrapper[i]);
      return cArray;
  }

  protected static player_extent2d_t[] cArrayWrap(long[] cArray, boolean cMemoryOwn) {
    player_extent2d_t[] arrayWrapper = new player_extent2d_t[cArray.length];
    for (int i=0; i<cArray.length; i++)
      arrayWrapper[i] = new player_extent2d_t(cArray[i], cMemoryOwn);
    return arrayWrapper;
  }

  public void setX0(double value) {
    playercore_javaJNI.player_extent2d_t_x0_set(swigCPtr, this, value);
  }

  public double getX0() {
    return playercore_javaJNI.player_extent2d_t_x0_get(swigCPtr, this);
  }

  public void setY0(double value) {
    playercore_javaJNI.player_extent2d_t_y0_set(swigCPtr, this, value);
  }

  public double getY0() {
    return playercore_javaJNI.player_extent2d_t_y0_get(swigCPtr, this);
  }

  public void setX1(double value) {
    playercore_javaJNI.player_extent2d_t_x1_set(swigCPtr, this, value);
  }

  public double getX1() {
    return playercore_javaJNI.player_extent2d_t_x1_get(swigCPtr, this);
  }

  public void setY1(double value) {
    playercore_javaJNI.player_extent2d_t_y1_set(swigCPtr, this, value);
  }

  public double getY1() {
    return playercore_javaJNI.player_extent2d_t_y1_get(swigCPtr, this);
  }

  public player_extent2d_t() {
    this(playercore_javaJNI.new_player_extent2d_t(), true);
  }

}
