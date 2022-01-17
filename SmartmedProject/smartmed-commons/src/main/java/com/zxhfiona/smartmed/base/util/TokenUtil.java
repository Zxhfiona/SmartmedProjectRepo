package com.zxhfiona.smartmed.base.util;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <b>基础信息功能 - Token 工具类</b>
 * <p>
 *     为了能够实现 Token 机制，选择借助于 JWT（JSON Web Token） 来实现，
 *     通过 JWT 能够实现一个唯一经过加密的 Token
 * </p>
 *
 * @author Fiona
 * @date 2022/1/6
 * @version 1.0.0
 * @since 1.0.0
 */
public class TokenUtil {
	// 设定系统加密算法
	private static Algorithm algorithm = Algorithm.HMAC256(BaseConstants.SECRET_KEY);
	// 设置 Token 头部信息 Map 集合
	private static final Map<String, Object> HEADER_MAP = new HashMap<String, Object>();
	// 设置载荷存储 KEY
	private static final String CLAIM_KEY = "CLAIM_MSG";

	static {
		// 使用静态代码块对头部信息 Map 进行初始化
		HEADER_MAP.put("typ", "jwt");
		HEADER_MAP.put("alg", "HS256");
	}

	/**
	 * <b>根据用户所给定的信息生成 Token</b>
	 * @param claimMap
	 * @param expireSec
	 * @return
	 */
	public static String createToken(Map<String, Object> claimMap, Long expireSec) {
		return JWT.create()
				// 设置 JWT 头部信息
				.withHeader(HEADER_MAP)
				// 设置 JWT 载荷部分信息
				.withClaim(CLAIM_KEY, claimMap)
				// 设置 JWT 过期时间
				.withExpiresAt(new Date(new Date().getTime() + expireSec * 1000))
				// 进行签名，生成 Token
				.sign(algorithm);
	}

	/**
	 * <b>校验 Token 信息，获得该 Token 中的有效载荷数据</b>
	 * @param token
	 * @return
	 */
	public static Map<String, Object> verifyToken(String token) {
		if (token != null && !"".equals(token.trim())) {
			// 根据加密算法创建 Token 校验对象 JWTVerifier 对象
			JWTVerifier verifier = JWT.require(algorithm).build();
			try {
				// 使用 JWT 校验对象对 Token 信息进行校验
				DecodedJWT decodedJWT = verifier.verify(token);
				if (decodedJWT != null) {
					// 该 Token 信息校验通过，则进行信息提取
					return decodedJWT.getClaim(CLAIM_KEY).asMap();
				}
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
		}
		return null;
	}
}
