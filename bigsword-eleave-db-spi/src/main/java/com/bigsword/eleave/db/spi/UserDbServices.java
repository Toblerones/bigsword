package com.bigsword.eleave.db.spi;

import com.bigsword.eleave.domain.User;

public interface UserDbServices {
	public User getUser(String userId);
	public void updateUser(User user);
	public void addUser(User user);
	public void deleteUser(String userId);
}
