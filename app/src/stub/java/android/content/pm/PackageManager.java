// app/src/stub/java/android/content/pm/PackageManager.java
package android.content.pm;

import androidx.annotation.NonNull;

public class PackageManager {
    /**
     * @hide
     * STUB - Real implementation exists in system
     */
    public static final int DELETE_SUCCEEDED = 1;

    public void setApplicationEnabledSetting(String pkg, int state, int flags) {
        throw new UnsupportedOperationException("STUB");
    }

    /**
     * @hide
     * STUB - Real implementation exists in system
     */
    public void setSyntheticAppDetailsActivityEnabled(@NonNull String packageName,
                                                      boolean enabled) {
        throw new UnsupportedOperationException(
                "STUB: setSyntheticAppDetailsActivityEnabled not implemented");
    }
}