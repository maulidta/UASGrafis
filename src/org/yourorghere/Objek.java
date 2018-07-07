/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.yourorghere;

import javax.media.opengl.GL;
import javax.media.opengl.glu.GLU;
import javax.media.opengl.glu.GLUquadric;

/**
 *
 * @author andik
 */
public class Objek {

    static void bak(GL gl) {
        gl.glBegin(GL.GL_POLYGON);/* f1: Surface bagian belakang */
        gl.glColor3f(1.0f, 1f, 1f);
        gl.glVertex3f(-0.5f, -1.7f, -3.0f);
        gl.glVertex3f(-0.5f, 2.0f, -3.0f);
        gl.glVertex3f(-4.0f, 2.0f, -3.0f);
        gl.glVertex3f(-4.0f, -1.7f, -3.0f);
        gl.glEnd();

        gl.glBegin(GL.GL_POLYGON);/* f1: Surface bagian atas */
        gl.glColor3f(1f, 1f, 1f);
        gl.glVertex3f(-0.5f, 2.0f, -3.0f);
        gl.glVertex3f(-4.0f, 2.0f, -3.0f);
        gl.glVertex3f(-0.5f, 2.0f, 0.0f);
        gl.glVertex3f(-4.0f, 2.0f, 0.0f);
        gl.glVertex3f(-4.0f, 2.0f, -3.0f);
        gl.glEnd();

        gl.glBegin(GL.GL_POLYGON);/* f1: Surface bagian bawah */
        gl.glColor3f(1f, 1f, 1f);
        gl.glVertex3f(-0.5f, -1.7f, -3.0f);
        gl.glVertex3f(-4.0f, -1.7f, -3.0f);
        gl.glVertex3f(-0.5f, -1.7f, 0.0f);
        gl.glVertex3f(-4.0f, -1.7f, 0.0f);
        gl.glVertex3f(-4.0f, -1.7f, -3.0f);
        gl.glEnd();

        gl.glBegin(GL.GL_POLYGON);/* f1: Surface bagian depan */
        gl.glColor3f(1f, 1f, 1f);
        gl.glVertex3f(-0.5f, -1.7f, 0.0f);
        gl.glVertex3f(-0.5f, 2.0f, 0.0f);
        gl.glVertex3f(-4.0f, 2.0f, 0.0f);
        gl.glVertex3f(-4.0f, -1.7f, 0.0f);
        gl.glEnd();

        gl.glBegin(GL.GL_POLYGON);/* f1: Surface bagian samping kanan */
        gl.glColor3f(1f, 1f, 1f);
        gl.glVertex3f(-0.5f, -1.7f, 0.0f);
        gl.glVertex3f(-0.5f, -1.7f, -3.0f);
        gl.glVertex3f(-0.5f, 2.0f, 0.0f);
        gl.glVertex3f(-0.5f, 2.0f, -3.0f);
        gl.glVertex3f(-0.5f, -1.7f, -3.0f);
        gl.glEnd();

        gl.glBegin(GL.GL_POLYGON);/* f1: Surface bagian samping kiri */
        gl.glColor3f(1f, 1f, 1f);
        gl.glVertex3f(-4.0f, -1.7f, 0.0f);
        gl.glVertex3f(-4.0f, -1.7f, -3.0f);
        gl.glVertex3f(-4.0f, 2.0f, 0.0f);
        gl.glVertex3f(-4.0f, 2.0f, -3.0f);
        gl.glVertex3f(-4.0f, -1.7f, -3.0f);
        gl.glEnd();

    }

    static void badanatas(GL gl) {
        gl.glBegin(GL.GL_POLYGON); //samping belakang
        gl.glColor3f(1.0f, 0.0f, 0.0f);
        gl.glVertex3f(2.0f, -0.6f, -4.0f);
        gl.glVertex3f(-0.5f, -0.6f, -4.0f);
        gl.glVertex3f(-0.5f, 1.0f, -4.0f);
        gl.glVertex3f(1.0f, 1.0f, -4.0f);
        gl.glEnd();

        gl.glBegin(GL.GL_POLYGON);
        gl.glColor3f(1.0f, 0.0f, 0.0f);
        gl.glVertex3f(-0.5f, 1.0f, 0f);
        gl.glVertex3f(1f, 1f, 0f);
        gl.glVertex3f(-0.5f, 1.0f, -4.0f);
        gl.glVertex3f(1f, 1.0f, -4.0f);
        gl.glVertex3f(1f, 1f, 0f);
        gl.glEnd();
//    
        gl.glBegin(GL.GL_POLYGON); //samping depan
        gl.glColor3f(1.0f, 0.0f, 0.0f);
        gl.glVertex3f(2.0f, -0.6f, 0f);
        gl.glVertex3f(-0.5f, -0.6f, 0f);
        gl.glVertex3f(-0.5f, 1.0f, 0f);
        gl.glVertex3f(1.0f, 1.0f, 0f);
        gl.glEnd();
//    
        gl.glBegin(GL.GL_POLYGON); //tutup depan
        gl.glColor3f(1.0f, 0.0f, 0.0f);
        gl.glVertex3f(2.0f, -0.6f, -4.0f);
        gl.glVertex3f(2.0f, -0.6f, 0.0f);
        gl.glVertex3f(1.0f, 1.0f, 0.0f);
        gl.glVertex3f(1.0f, 1.0f, -4.0f);
        gl.glEnd();
//    
        gl.glBegin(GL.GL_POLYGON); // tutup bawah
        gl.glColor3f(1.0f, 0.0f, 0.0f);
        gl.glVertex3f(-0.5f, -0.6f, -4.0f);
        gl.glVertex3f(2.0f, -0.6f, -4.0f);
        gl.glVertex3f(-0.5f, -0.6f, 0.0f);
        gl.glVertex3f(2.0f, -0.6f, 0.0f);
        gl.glVertex3f(2.0f, -0.6f, -4.0f);
        gl.glEnd();
//    
        gl.glBegin(GL.GL_POLYGON); // tutup belakang
        gl.glColor3f(1.0f, 0.0f, 0.0f);
        gl.glVertex3f(-0.5f, -0.6f, 0.0f);
        gl.glVertex3f(-0.5f, 1.0f, 0.0f);
        gl.glVertex3f(-0.5f, -0.6f, -4.0f);
        gl.glVertex3f(-0.5f, 1.0f, -4.0f);
        gl.glVertex3f(-0.5f, 1.0f, 0.0f);
        gl.glEnd();
    }

    static void badanbawah(GL gl) {
        gl.glBegin(GL.GL_POLYGON); // bak kotak belakang ijo
        gl.glColor3f(1.0f, 0.0f, 0.0f);
        gl.glVertex3f(2f, -0.6f, -4f);
        gl.glVertex3f(2f, -2f, -4f);
        gl.glVertex3f(-4f, -2f, -4f);
        gl.glVertex3f(-4f, -0.6f, -4f);
        gl.glEnd();

        gl.glBegin(GL.GL_POLYGON); // bak kotak samping biru
        gl.glColor3f(1.0f, 0.0f, 0.0f);
        gl.glVertex3f(-4f, -2f, -4f);
        gl.glVertex3f(-4f, -0.6f, -4f);
        gl.glVertex3f(-4f, -0.6f, 0f);
        gl.glVertex3f(-4f, -2f, 0f);
        gl.glEnd();

        gl.glBegin(GL.GL_POLYGON); // bak kotak atas koneng
        gl.glColor3f(1.0f, 0.0f, 0.0f);
        gl.glVertex3f(-4f, -0.6f, 0f);
        gl.glVertex3f(2f, -0.6f, 0f);
        gl.glVertex3f(2f, -0.6f, -4f);
        gl.glVertex3f(-4f, -0.6f, -4f);
        gl.glEnd();

        gl.glBegin(GL.GL_POLYGON); // bak samping atas merah
        gl.glColor3f(1.0f, 0f, 0f);
        gl.glVertex3f(2f, -0.6f, -4f);
        gl.glVertex3f(2f, -2f, -4f);
        gl.glVertex3f(2f, -0.6f, 0f);
        gl.glVertex3f(2f, -2f, 0f);
        gl.glVertex3f(2f, -2f, -4f);
        gl.glEnd();

        gl.glBegin(GL.GL_POLYGON); // bak kotak depan ijo muda
        gl.glColor3f(1.0f, 0.0f, 0.0f);
        gl.glVertex3f(-4f, -0.6f, 0f);
        gl.glVertex3f(2f, -0.6f, 0f);
        gl.glVertex3f(-4f, -2.0f, 0f);
        gl.glVertex3f(2f, -2.0f, 0f);
        gl.glVertex3f(2f, -0.6f, 0f);
        gl.glEnd();

        gl.glBegin(GL.GL_POLYGON); // bak kotak bawah bitu
        gl.glColor3f(1.0f, 0.0f, 0.0f);
        gl.glVertex3f(-4f, -2.0f, -4f);
        gl.glVertex3f(2f, -2.0f, -4f);
        gl.glVertex3f(-4f, -2.0f, 0f);
        gl.glVertex3f(2f, -2.0f, 0f);
        gl.glVertex3f(2f, -2.0f, -4f);
        gl.glEnd();
    }

}
