package com.example.imageclassifier;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.util.SparseIntArray;
import android.view.Surface;

import com.google.firebase.ml.vision.face.FirebaseVisionFaceDetectorOptions;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // High-accuracy landmark detection and face classification
        FirebaseVisionFaceDetectorOptions highAccuracyOpts =
                new FirebaseVisionFaceDetectorOptions.Builder()
                        .setPerformanceMode(FirebaseVisionFaceDetectorOptions.ACCURATE)
                        .setLandmarkMode(FirebaseVisionFaceDetectorOptions.ALL_LANDMARKS)
                        .setClassificationMode(FirebaseVisionFaceDetectorOptions.ALL_CLASSIFICATIONS)
                        .build();

        // Real-time contour detection of multiple faces
                FirebaseVisionFaceDetectorOptions realTimeOpts =
                        new FirebaseVisionFaceDetectorOptions.Builder()
                                .setContourMode(FirebaseVisionFaceDetectorOptions.ALL_CONTOURS)
                                .build();



        private static final SparseIntArray ORIENTATIONS = new SparseIntArray();
        static {
            ORIENTATIONS.append(Surface.ROTATION_0, 90);
            ORIENTATIONS.append(Surface.ROTATION_90, 0);
            ORIENTATIONS.append(Surface.ROTATION_180, 270);
            ORIENTATIONS.append(Surface.ROTATION_270, 180);
        }

/**
 * Get the angle by which an image must be rotated given the device's current
 * orientation.
 */
        @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
        private int getRotationCompensation(String Object cameraId;
        cameraId, Activity activity, Context context)
        throws CameraAccessException {
            // Get the device's current rotation relative to its "native" orientation.
            // Then, from the ORIENTATIONS table, look up the angle the image must be
            // rotated to compensate for the device's rotation.
            int deviceRotation = activity.getWindowManager().getDefaultDisplay().getRotation();
            int rotationCompensation = ORIENTATIONS.get(deviceRotation);

            // On most devices, the sensor orientation is 90 degrees, but for some
            // devices it is 270 degrees. For devices with a sensor orientation of
            // 270, rotate the image an additional 180 ((270 + 270) % 360) degrees.
            CameraManager cameraManager = (CameraManager) context.getSystemService(CAMERA_SERVICE);
            int sensorOrientation = cameraManager
                    .getCameraCharacteristics(cameraId)
                    .get(CameraCharacteristics.SENSOR_ORIENTATION);
            rotationCompensation = (rotationCompensation + sensorOrientation + 270) % 360;

            // Return the corresponding FirebaseVisionImageMetadata rotation value.
            int result;
            switch (rotationCompensation) {
                case 0:
                    result = FirebaseVisionImageMetadata.ROTATION_0;
                    break;
                case 90:
                    result = FirebaseVisionImageMetadata.ROTATION_90;
                    break;
                case 180:
                    result = FirebaseVisionImageMetadata.ROTATION_180;
                    break;
                case 270:
                    result = FirebaseVisionImageMetadata.ROTATION_270;
                    break;
                default:
                    result = FirebaseVisionImageMetadata.ROTATION_0;
                    Log.e(TAG, "Bad rotation value: " + rotationCompensation);
            }
            return result;
        }


    }
}