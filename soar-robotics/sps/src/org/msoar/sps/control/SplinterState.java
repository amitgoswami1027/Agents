package org.msoar.sps.control;

import lcmtypes.pose_t;

interface SplinterState {
	pose_t getSplinterPose();
	void setOffset(double[] offset);
}
