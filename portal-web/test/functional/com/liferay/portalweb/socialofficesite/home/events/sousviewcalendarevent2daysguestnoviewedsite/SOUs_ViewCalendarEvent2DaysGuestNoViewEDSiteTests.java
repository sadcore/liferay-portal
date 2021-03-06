/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.portalweb.socialofficesite.home.events.sousviewcalendarevent2daysguestnoviewedsite;

import com.liferay.portalweb.portal.BaseTestSuite;
import com.liferay.portalweb.socialoffice.users.user.addsouser.AddSOUserTest;
import com.liferay.portalweb.socialoffice.users.user.addsouser.TearDownSOUserTest;
import com.liferay.portalweb.socialoffice.users.user.editsouserpassword.EditSOUserPasswordTest;
import com.liferay.portalweb.socialoffice.users.user.selectregularrolessouser.SelectRegularRolesSOUserTest;
import com.liferay.portalweb.socialoffice.users.user.signinso.SOUs_SignInSOTest;
import com.liferay.portalweb.socialoffice.users.user.signinso.SOUs_SignOutSOTest;
import com.liferay.portalweb.socialoffice.users.user.signinso.SignInSOTest;
import com.liferay.portalweb.socialoffice.users.user.signinso.SignOutSOTest;
import com.liferay.portalweb.socialofficehome.sites.site.addsitessite.AddSitesSiteTest;
import com.liferay.portalweb.socialofficehome.sites.site.addsitessite.TearDownSOSitesTest;
import com.liferay.portalweb.socialofficesite.calendar.calendarevent.addcalendareventsite.AddCalendarEventFuture1DaysSiteTest;
import com.liferay.portalweb.socialofficesite.calendar.calendarevent.addcalendareventsite.AddCalendarEventFuture2DaysSiteTest;
import com.liferay.portalweb.socialofficesite.calendar.calendarevent.addcalendareventsite.AddCalendarEventFuture3DaysSiteTest;
import com.liferay.portalweb.socialofficesite.calendar.calendarevent.addcalendareventsite.AddCalendarEventSiteTest;
import com.liferay.portalweb.socialofficesite.home.events.viewcalendareventsedsite.ConfigureDisplayDays4EDSiteTest;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * @author Brian Wing Shun Chan
 */
public class SOUs_ViewCalendarEvent2DaysGuestNoViewEDSiteTests
	extends BaseTestSuite {
	public static Test suite() {
		TestSuite testSuite = new TestSuite();
		testSuite.addTestSuite(AddSOUserTest.class);
		testSuite.addTestSuite(SelectRegularRolesSOUserTest.class);
		testSuite.addTestSuite(EditSOUserPasswordTest.class);
		testSuite.addTestSuite(AddSitesSiteTest.class);
		testSuite.addTestSuite(AddCalendarEventSiteTest.class);
		testSuite.addTestSuite(AddCalendarEventFuture1DaysSiteTest.class);
		testSuite.addTestSuite(AddCalendarEventFuture2DaysSiteTest.class);
		testSuite.addTestSuite(AddCalendarEventFuture3DaysSiteTest.class);
		testSuite.addTestSuite(EditPermissionsCalendarEvent2DaysGuestNoViewTest.class);
		testSuite.addTestSuite(ConfigureDisplayDays4EDSiteTest.class);
		testSuite.addTestSuite(ViewCalendarEvent2DaysGuestNoViewEDSiteTest.class);
		testSuite.addTestSuite(SignOutSOTest.class);
		testSuite.addTestSuite(SOUs_SignInSOTest.class);
		testSuite.addTestSuite(SOUs_ViewCalendarEvent2DaysGuestNoViewEDSiteTest.class);
		testSuite.addTestSuite(SOUs_SignOutSOTest.class);
		testSuite.addTestSuite(SignInSOTest.class);
		testSuite.addTestSuite(TearDownSOUserTest.class);
		testSuite.addTestSuite(TearDownSOSitesTest.class);

		return testSuite;
	}
}