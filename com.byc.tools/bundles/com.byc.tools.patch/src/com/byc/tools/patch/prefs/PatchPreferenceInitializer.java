package com.byc.tools.patch.prefs;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

import com.byc.tools.patch.PatchPlugin;

public class PatchPreferenceInitializer extends AbstractPreferenceInitializer {

	private static String gitReps = null;

	private static String patchBrs = null;

	public PatchPreferenceInitializer() {
		gitReps = "Talend/tcommon-studio-se;Talend/tdi-studio-se";
		patchBrs = "patch/6.3.1:Talend/tcommon-studio-se#sha1;patch/6.4.1:Talend/tdi-studio-se#dec1792";
	}

	@Override
	public void initializeDefaultPreferences() {
		IPreferenceStore store = PatchPlugin.getDefault().getPreferenceStore();
		store.setDefault(PreferenceUtils.PREF_KEY_GIT_REPS, gitReps);
		store.setDefault(PreferenceUtils.PREF_KEY_BRANCHES, patchBrs);
	}

}
