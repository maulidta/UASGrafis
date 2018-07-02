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
//    static void Kubus(GL gl)
//    {
//    gl.glBegin(GL.GL_POLYGON);/* f1: Surface bagian depan */
//    gl.glVertex3f(0.0f,0.0f,0.0f);
//    gl.glVertex3f(0.0f,0.0f,1.0f);
//    gl.glVertex3f(1.0f,0.0f,1.0f);
//    gl.glVertex3f(1.0f,0.0f,0.0f);
//    gl.glEnd();
//    gl.glBegin(GL.GL_POLYGON);/* f2: Surface bagian bawah
//   (ABFE) */
//    gl.glVertex3f(0.0f,0.0f,0.0f);
//    gl.glVertex3f(1.0f,0.0f,0.0f);
//    gl.glVertex3f(1.0f,1.0f,0.0f);
//    gl.glVertex3f(0.0f,1.0f,0.0f);
//    gl.glEnd();
// 
//    gl.glBegin(GL.GL_POLYGON);/* f3:Surface bagian belakang
//    (CDHG)*/
//    gl.glVertex3f(1.0f,1.0f,0.0f);
//    gl.glVertex3f(1.0f,1.0f,1.0f);
//    gl.glVertex3f(0.0f,1.0f,1.0f);
//    gl.glVertex3f(0.0f,1.0f,0.0f);
//    gl.glEnd();
//    
//    gl.glBegin(GL.GL_POLYGON);/* f4: Surface bagian atas
//    (EFGH)*/
//     gl.glVertex3f(1.0f,1.0f,1.0f);
//     gl.glVertex3f(1.0f,0.0f,1.0f);
//     gl.glVertex3f(0.0f,0.0f,1.0f);
//     gl.glVertex3f(0.0f,1.0f,1.0f);
//     gl.glEnd();
//
//     gl.glBegin(GL.GL_POLYGON);/* f5: Surface bagian kiri 
//     (ADEH)*/
//    gl.glVertex3f(0.0f,0.0f,0.0f);
//    gl.glVertex3f(0.0f,1.0f,0.0f);
//    gl.glVertex3f(0.0f,1.0f,1.0f);
//    gl.glVertex3f(0.0f,0.0f,1.0f);
//    gl.glEnd();
//    
//    gl.glBegin(GL.GL_POLYGON);/* f6: Surface bagian kanan
//   (BCFG)*/
//    gl.glVertex3f(1.0f,0.0f,0.0f);
//    gl.glVertex3f(1.0f,0.0f,1.0f);
//    gl.glVertex3f(1.0f,1.0f,1.0f);
//    gl.glVertex3f(1.0f,1.0f,0.0f);
//    gl.glEnd();
//    }

    static void badanatas(GL gl) {
        gl.glBegin(GL.GL_POLYGON); //samping belakang
        gl.glColor3f(1.0f, 1.0f, 1.0f);
        gl.glVertex3f(2.0f, -0.6f, -4.0f);
        gl.glVertex3f(-0.5f, -0.6f, -4.0f);
        gl.glVertex3f(-0.5f, 1.0f, -4.0f);
        gl.glVertex3f(1.0f, 1.0f, -4.0f);
        gl.glEnd();

        gl.glBegin(GL.GL_POLYGON);
        gl.glColor3f(1.0f, 1.0f, 1.0f);
        gl.glVertex3f(-0.5f, 1.0f, 0f);
        gl.glVertex3f(1f, 1f, 0f);
        gl.glVertex3f(-0.5f, 1.0f, -4.0f);
        gl.glVertex3f(1f, 1.0f, -4.0f);
        gl.glVertex3f(1f, 1f, 0f);
        gl.glEnd();
//    
        gl.glBegin(GL.GL_POLYGON); //samping depan
        gl.glColor3f(1.0f, 1.0f, 1.0f);
        gl.glVertex3f(2.0f, -0.6f, 0f);
        gl.glVertex3f(-0.5f, -0.6f, 0f);
        gl.glVertex3f(-0.5f, 1.0f, 0f);
        gl.glVertex3f(1.0f, 1.0f, 0f);
        gl.glEnd();
//    
        gl.glBegin(GL.GL_POLYGON); //tutup depan
        gl.glColor3f(1.0f, 1.0f, 1.0f);
        gl.glVertex3f(2.0f, -0.6f, -4.0f);
        gl.glVertex3f(2.0f, -0.6f, 0.0f);
        gl.glVertex3f(1.0f, 1.0f, 0.0f);
        gl.glVertex3f(1.0f, 1.0f, -4.0f);
        gl.glEnd();

        gl.glBegin(GL.GL_POLYGON); // tutup bawah
        gl.glColor3f(1.0f, 1.0f, 1.0f);
        gl.glVertex3f(-0.5f, -0.6f, -4.0f);
        gl.glVertex3f(2.0f, -0.6f, -4.0f);
        gl.glVertex3f(-0.5f, -0.6f, 0.0f);
        gl.glVertex3f(2.0f, -0.6f, 0.0f);
        gl.glVertex3f(2.0f, -0.6f, -4.0f);
        gl.glEnd();

        gl.glBegin(GL.GL_POLYGON); // tutup belakang
        gl.glColor3f(1.0f, 1.0f, 1.0f);
        gl.glVertex3f(-0.5f, -0.6f, 0.0f);
        gl.glVertex3f(-0.5f, 1.0f, 0.0f);
        gl.glVertex3f(-0.5f, -0.6f, -4.0f);
        gl.glVertex3f(-0.5f, 1.0f, -4.0f);
        gl.glVertex3f(-0.5f, 1.0f, 0.0f);
        gl.glEnd();
    }

    static void badanbawah(GL gl) {
        gl.glBegin(GL.GL_POLYGON); // bak kotak belakang biru muda 
        gl.glColor3f(0.0f, 1.0f, 0f);
        gl.glVertex3f(2f, -0.6f, -4f);
        gl.glVertex3f(2f, -2f, -4f);
        gl.glVertex3f(-4f, -2f, -4f);
        gl.glVertex3f(-4f, -0.6f, -4f);
        gl.glEnd();

        gl.glBegin(GL.GL_POLYGON); // bak kotak samping hijau
        gl.glColor3f(0.0f, 1.0f, 1f);
        gl.glVertex3f(-4f, -2f, -4f);
        gl.glVertex3f(-4f, -0.6f, -4f);
        gl.glVertex3f(-4f, -0.6f, 0f);
        gl.glVertex3f(-4f, -2f, 0f);
        gl.glEnd();

        gl.glBegin(GL.GL_POLYGON); // bak kotak atas kuning
        gl.glColor3f(1.0f, 1.0f, 0f);
        gl.glVertex3f(-4f, -0.6f, 0f);
        gl.glVertex3f(2f, -0.6f, 0f);
        gl.glVertex3f(2f, -0.6f, -4f);
        gl.glVertex3f(-4f, -0.6f, -4f);
        gl.glEnd();

//        gl.glBegin(GL.GL_POLYGON); // bak kotak atas kuning
//        gl.glColor3f(1.0f, 0f, 0f);
//        gl.glVertex3f(-4f, -0.6f, -4f);
//        gl.glVertex3f(-4f, -2f, -4f);
//        gl.glVertex3f(2f, -0.6f, 0f);
//        gl.glVertex3f(-4f, -0.6f, 0f);
//        gl.glEnd();
    }

    static void roda(GL gl) {
        float BODY_LENGTH = 3.0f;
        float BODY_RADIUS = 0.2f;
        int SLICES = 60;
        int STACKS = 60;
        GLU glu = new GLU();
        GLUquadric q = glu.gluNewQuadric();
        gl.glColor3f(1.0f, 1.0f, 0.0f);
        glu.gluCylinder(q, BODY_RADIUS, BODY_RADIUS, BODY_LENGTH, SLICES, STACKS);
        glu.gluDisk(q, 0.0f, BODY_RADIUS, SLICES, STACKS);
        //lingkaran untuk tutup atas
        gl.glTranslatef(0.0f, 0.0f, BODY_LENGTH);
        glu.gluDisk(q, 0.0f, BODY_RADIUS, SLICES, STACKS);
        //lingkaran untuk tutup bawah
    }

    static void bak(GL gl) {
        gl.glBegin(GL.GL_POLYGON); //Permukaan bagian bawah
        gl.glColor3f(1.0f, 1.0f, 0.0f);
        gl.glVertex3f(0.0f, 0.0f, 0.0f);
        gl.glVertex3f(0.0f, 0.0f, 1.0f);
        gl.glVertex3f(1.0f, 0.0f, 1.0f);
        gl.glVertex3f(1.0f, 0.0f, 0.0f);
        gl.glEnd();

        gl.glBegin(GL.GL_POLYGON); //Permukaan bagian tegak1
        gl.glColor3f(0.0f, 1.0f, 0.0f);
        gl.glVertex3f(0.0f, 0.0f, 0.0f);
        gl.glVertex3f(1.0f, 0.0f, 0.0f);
        gl.glVertex3f(1.0f, 1.0f, 0.0f);
        gl.glVertex3f(0.0f, 1.0f, 0.0f);
        gl.glEnd();

        gl.glBegin(GL.GL_POLYGON); //Permukaan bagian atas
        gl.glColor3f(1.0f, 1.0f, 1.0f);
        gl.glVertex3f(1.0f, 1.0f, 0.0f);
        gl.glVertex3f(1.0f, 1.0f, 1.0f);
        gl.glVertex3f(0.0f, 1.0f, 1.0f);
        gl.glVertex3f(0.0f, 1.0f, 0.0f);
        gl.glEnd();

        gl.glBegin(GL.GL_POLYGON); //Permukaan bbagian atas
        gl.glVertex3f(1.0f, 0.0f, 0.0f);
        gl.glVertex3f(1.0f, 0.0f, 1.0f);
        gl.glVertex3f(0.0f, 0.0f, 1.0f);
        gl.glVertex3f(0.0f, 1.0f, 1.0f);
        gl.glEnd();

        gl.glBegin(GL.GL_POLYGON); //Permukaan bagian kiri 
        gl.glColor3f(0.0f, 0.0f, 1.0f);
        gl.glVertex3f(0.0f, 0.0f, 0.0f);
        gl.glVertex3f(0.0f, 1.0f, 0.0f);
        gl.glVertex3f(0.0f, 1.0f, 1.0f);
        gl.glVertex3f(0.0f, 0.0f, 1.0f);
        gl.glEnd();

        gl.glBegin(GL.GL_POLYGON); //Permukaan bagian kanan
        gl.glColor3f(0.0f, 1.0f, 1.0f);
        gl.glVertex3f(1.0f, 0.0f, 0.0f);
        gl.glVertex3f(1.0f, 0.0f, 1.0f);
        gl.glVertex3f(1.0f, 1.0f, 1.0f);
        gl.glVertex3f(1.0f, 1.0f, 0.0f);
        gl.glEnd();
    }

}
