package com.haifeiWu.service;

import com.haifeiWu.entity.PHCSMP_Room;

public interface RoomService {
	public PHCSMP_Room findbyIp(String ip);

	public PHCSMP_Room findByCardReaderID(int cardReaderID);

	public PHCSMP_Room findByRoomID(int roomId);
}