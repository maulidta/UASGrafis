package org.yourorghere;

import javax.media.opengl.GL;
import javax.media.opengl.GLAutoDrawable;
import javax.media.opengl.GLEventListener;
import javax.media.opengl.glu.GLU;

/**
 * GLRenderer.java <BR>
 * author: Brian Paul (converted to Java by Ron Cemer and Sven Goethel)
 * <P>
 *
 * This version is equal to Brian Paul's version 1.2 1999/10/21
 */
public class GLRenderer implements GLEventListener {
//class vector untuk memudah vektor-isasi

    private class vector {

        float x;
        float y;
        float z;

        public vector(float startX, float startY, float startZ) {
            x = startX;
            y = startY;
            z = startZ;
        }
    }
    vector lineal = new vector(0f, 0f, -1f);//deklarasi awal vektor untuk maju
    vector lineal2 = new vector(0f, 0f, 1f);//deklarasi awal vektor untuk maju
    vector lateral = new vector(-1f, 0f, 0f);//deklarasi awal vektor untuk gerakan ke kanan
    vector lateral2 = new vector(1f, 0f, 0f);//deklarasi awal vektor untuk gerakan ke kanan
    vector vertical = new vector(0f, 1f, 0f);//deklarasi awal vetor untuk gerakan naik
    vector vertical2 = new vector(0f, -1f, 0f);//deklarasi awal vetor untuk gerakan naik
/*
     ini adalah metod untuk melakukan pergerakan.
     magnitude adalah besarnya gerakan sedangkan direction digunakan untuk menentukan arah.
     gunakan -1 untuk arah berlawanan dengan vektor awal
     */

    private void vectorMovement(vector toMove, float magnitude, float direction) {
        float speedX = toMove.x * magnitude * direction;
        float speedY = toMove.y * magnitude * direction;
        float speedZ = toMove.z * magnitude * direction;
        Cx += speedX;
        Cy += speedY;
        Cz += speedZ;
        Lx += speedX;
        Ly += speedY;
        Lz += speedZ;
    }
    float Cx = 5f, Cy = 0f, Cz = 5f;
    float Lx = 0f, Ly = 0f, Lz = -20f;

    private float angel =0;
    public void init(GLAutoDrawable drawable) {
// Use debug pipeline
// drawable.setGL(new DebugGL(drawable.getGL()));
        GL gl = drawable.getGL();
        System.err.println("INIT GL IS: " + gl.getClass().getName());
// Enable VSync
        gl.setSwapInterval(1);
// Setup the drawing area and shading mode
        gl.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        gl.glShadeModel(GL.GL_SMOOTH); // try setting this to GL_FLAT and see what happens.
    }

    public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {
        GL gl = drawable.getGL();
        GLU glu = new GLU();
        if (height <= 0) { // avoid a divide by zero error!
            height = 1;
        }
        final float h = (float) width / (float) height;
        gl.glViewport(0, 0, width, height);
        gl.glMatrixMode(GL.GL_PROJECTION);
        gl.glLoadIdentity();
        glu.gluPerspective(45.0f, h, 1.0, 20.0);
        gl.glMatrixMode(GL.GL_MODELVIEW);
        gl.glLoadIdentity();
    }

    public void display(GLAutoDrawable drawable) {
        GL gl = drawable.getGL();
        GLU glu = new GLU();
// Clear the drawing area
        gl.glClear(GL.GL_COLOR_BUFFER_BIT | GL.GL_DEPTH_BUFFER_BIT);
// Reset the current matrix to the "identity"
        gl.glLoadIdentity();
// Move the "drawing cursor" around
        glu.gluLookAt(Cx, Cy, Cz,
                Lx, Ly, Lz,
                0, 1, 0);
        gl.glTranslatef(0f, 0f, -5f);
        gl.glRotatef(0.0f, 1.0f, 0.0f, 0.0f);
        gl.glRotatef(0.0f, 0.0f, 0.0f, 1.0f);
        
        gl.glPushMatrix();

        gl.glPopMatrix();
        
        gl.glPushMatrix();
//        gl.glTranslatef(0f, 0.5f, -5f);
        Objek.badanatas(gl);
        gl.glPopMatrix();
        
//        gl.glPushMatrix();
//        Objek.Kubus(gl);
//        gl.glPopMatrix();
        
        
// Flush all drawing operations to the graphics card
        gl.glFlush();
    }

    public void displayChanged(GLAutoDrawable drawable, boolean modeChanged, boolean deviceChanged) {
    }

    void Key_Pressed(int keyCode) {
        //huruf S = belakang
        if (keyCode == 83) {
            vectorMovement(lineal, 2f, -1f);
        }//huruf W = depan
        else if (keyCode == 87) {
            vectorMovement(lineal2, 2f, -1f);
        } //huruf D = kanan
        else if (keyCode == 65) {
            vectorMovement(lateral, 2f, -1f);
        } //huruf A = kiri
        else if (keyCode == 68) {
            vectorMovement(lateral2, 2f, -1f);
        } //panah atas
        else if (keyCode == 38) {
            vectorMovement(vertical, 2f, -1f);
        } //panah bawah
        else if (keyCode == 40) {
            vectorMovement(vertical2, 2f, -1f);
        } else if (keyCode == 88) {
            Cx = 2f;
            Cy = 10f;
            Cz = -6f;
            Lx = 0f;
            Ly = -90f;
            Lz = 0f;
//            Cx = 2f;
//            Cy = 10f;
//            Cz = 2f;
//            Lx = 0f;
//            Ly = 0f;
//            Lz = 0f;
        }
// else throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
